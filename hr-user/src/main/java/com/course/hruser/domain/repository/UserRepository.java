package com.course.hruser.domain.repository;

import com.course.hruser.domain.orm.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
