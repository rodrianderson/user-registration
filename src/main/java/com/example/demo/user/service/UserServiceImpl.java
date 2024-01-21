package com.example.demo.user.service;

import com.example.demo.user.dto.Address;
import com.example.demo.user.dto.UserDto;
import com.example.demo.user.dto.UserInfo;
import com.example.demo.user.entity.User;
import com.example.demo.user.enums.UserStatusEnum;
import com.example.demo.user.enums.UserStatusRecordEnum;
import com.example.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Optional<User> getUserByCpf(String userCpf) {
        return userRepository.findByCpf(userCpf);
    }

    @Override
    public Optional<User> getUserByStatus(UserStatusEnum userStatus) {
        return userRepository.findByStatus(userStatus);
    }

    @Override
    public User createUser(UserDto userDto) {
        User newUser = convertToNewUser(userDto);
        return userRepository.save(newUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(Long userId, UserDto userDto) {
        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();

            user.getUserInfo().setName(userDto.getName());
            user.getUserInfo().setUserRecord(UserStatusRecordEnum.UPDATE);
            user.getUserInfo().setRegisterDate(new Date());

            user.setName(userDto.getName());
            user.setDateBirth(userDto.getDateBirth());
            user.getAddress().setStreet(userDto.getAddress().getStreet());
            user.getAddress().setNumber(userDto.getAddress().getNumber());
            user.getAddress().setComplement(userDto.getAddress().getComplement());
            user.getAddress().setNeighborhood(userDto.getAddress().getNeighborhood());
            user.getAddress().setCity(userDto.getAddress().getCity());
            user.getAddress().setState(userDto.getAddress().getState());
            user.getAddress().setZipCode(userDto.getAddress().getZipCode());

            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    public void deactivateUser(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setStatus(UserStatusEnum.REMOVIDO);
            userRepository.save(user);
        }
    }

    private User convertToNewUser(UserDto userDto) {
        User user = new User();
        user.setCpf(userDto.getCpf());
        user.setName(userDto.getName());
        user.setDateBirth(userDto.getDateBirth());

        Address address = new Address();
        address.setStreet(userDto.getAddress().getStreet());
        address.setNumber(userDto.getAddress().getNumber());
        address.setComplement(userDto.getAddress().getComplement());
        address.setNeighborhood(userDto.getAddress().getNeighborhood());
        address.setCity(userDto.getAddress().getCity());
        address.setState(userDto.getAddress().getState());
        address.setZipCode(userDto.getAddress().getZipCode());
        user.setAddress(address);

        user.setStatus(UserStatusEnum.ATIVO);

        UserInfo userInfo = new UserInfo();
        user.setName(userDto.getName());
        userInfo.setName(userDto.getName());
        userInfo.setUserRecord(UserStatusRecordEnum.CREATE);
        userInfo.setRegisterDate(new Date());
        user.setUserInfo(userInfo);

        return user;
    }
}
