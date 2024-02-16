package com.tobeto.bootcampProject.webapi;

import com.tobeto.bootcampProject.dataaccess.UserRepository;
import com.tobeto.bootcampProject.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
    @RestController("/users")
    public class UsersController {

        private UserRepository userRepository;

        public UsersController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @RequestMapping("/")
        public List<User> findAll() {
            return userRepository.findAll();
        }

        @RequestMapping("/add")
        public void add() {
            User user = new User();
            user.setUserName("firstlast");
            user.setEmail("firstlast@fakemail.net");
            userRepository.save(user);
        }
}
