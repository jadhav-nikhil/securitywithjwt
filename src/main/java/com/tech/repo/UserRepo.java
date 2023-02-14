package com.tech.repo;

import com.tech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}
