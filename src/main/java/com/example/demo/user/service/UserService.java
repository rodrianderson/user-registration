package com.example.demo.user.service;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.entity.User;
import com.example.demo.user.enums.UserStatusEnum;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Long userId);

    Optional<User> getUserByCpf(String userCpf);

    Optional<User> getUserByStatus(UserStatusEnum userStatus);

    User createUser(UserDto userDto);

    void deleteUser(Long userId);

    User updateUser(Long userId, UserDto userInfo);

    void deactivateUser(Long userId);
}
