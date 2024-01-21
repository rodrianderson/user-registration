package com.example.demo.user.repository;


import com.example.demo.user.entity.User;
import com.example.demo.user.enums.UserStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByCpf(String cpf);
    Optional<User> findByStatus(UserStatusEnum userStatus);


}
