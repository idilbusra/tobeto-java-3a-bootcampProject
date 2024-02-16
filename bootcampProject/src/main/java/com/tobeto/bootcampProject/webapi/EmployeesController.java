package com.tobeto.bootcampProject.webapi;
import com.tobeto.java3a.bootcampproject.dataaccess.EmployeeRepository;
import com.tobeto.java3a.bootcampproject.entities.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

    @RestController("/employees")
    public class EmployeesController {

        private EmployeeRepository employeeRepository;

        public EmployeesController(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }

        @RequestMapping("/")
        public List<Employee> findAll() {
            return employeeRepository.findAll();
        }

        @RequestMapping("/add")
        public void add() {
            Employee employee = new Employee();
            employee.setUserName("username");
            employee.setEmail("firstlast@fakemail.net");
            employee.setPosition("deneme");
            employeeRepository.save(employee);
        }
}
