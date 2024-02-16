package com.tobeto.bootcampProject.dataaccess;

import com.tobeto.bootcampProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository {
    import com.tobeto.java3a.bootcampproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {
    }
}
