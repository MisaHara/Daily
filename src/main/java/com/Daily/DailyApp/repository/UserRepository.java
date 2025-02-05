package com.Daily.DailyApp.repository;

import com.Daily.DailyApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //todo можно будет добавить дополнительные методы
    User findByUsername(String username);
}
