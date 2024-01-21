package com.example.demo.user;

import com.example.demo.user.dto.Address;
import com.example.demo.user.dto.UserDto;
import com.example.demo.user.dto.UserInfo;
import com.example.demo.user.entity.User;
import com.example.demo.user.enums.UserStatusEnum;
import com.example.demo.user.enums.UserStatusRecordEnum;
import com.example.demo.user.repository.UserRepository;
import com.example.demo.user.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private UserRepository userRepository;

    private User testUser;
    private UserDto testUserDto;

    @BeforeEach
    public void setup() {
        testUser = new User();
        Date dateBirth = new Date();
        testUser.setCpf("12345678901");
        testUser.setName("Test User");
        testUser.setDateBirth(dateBirth);
        testUser.setStatus(UserStatusEnum.ATIVO);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserRecord(UserStatusRecordEnum.CREATE);
        userInfo.setRegisterDate(new Date());
        userInfo.setName(testUser.getName());
        testUser.setUserInfo(userInfo);
        Address userAddress = new Address();
        userAddress.setCity("User Test City");
        userAddress.setComplement("User Test Complement");
        userAddress.setState("User Test State");
        userAddress.setStreet("User Test Street");
        userAddress.setNumber(123456);
        userAddress.setNeighborhood("User Test Neighborhood");
        userAddress.setZipCode("User Test ZipCode");
        testUser.setAddress(userAddress);

        testUserDto = new UserDto();
        testUserDto.setCpf("12345678901");
        testUserDto.setName("Test User");
        testUserDto.setDateBirth(dateBirth);
        Address address = new Address();
        address.setCity("Test City");
        address.setComplement("Test Complement");
        address.setState("Test State");
        address.setStreet("Test Street");
        address.setNumber(123456);
        address.setNeighborhood("Test Neighborhood");
        address.setZipCode("Test ZipCode");
        testUserDto.setAddress(address);

    }

    @Test
    public void testGetAllUsers() {
        List<User> userList = new ArrayList<>();
        when(userRepository.findAll()).thenReturn(userList);

        List<User> result = userService.getAllUsers();

        assertEquals(userList, result);
    }

    @Test
    public void testGetUserById() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(testUser));

        Optional<User> result = userService.getUserById(1L);

        assertEquals(true, result.isPresent());
        assertEquals(testUser, result.get());
    }

    @Test
    public void testGetUserByCpf() {
        when(userRepository.findByCpf("12345678901")).thenReturn(Optional.of(testUser));

        Optional<User> result = userService.getUserByCpf("12345678901");

        assertTrue(result.isPresent());
        assertEquals(testUser, result.get());
    }

    @Test
    public void testGetUserByStatus() {
        when(userRepository.findByStatus(UserStatusEnum.ATIVO)).thenReturn(Optional.of(testUser));

        Optional<User> result = userService.getUserByStatus(UserStatusEnum.ATIVO);

        assertTrue(result.isPresent());
        assertEquals(testUser, result.get());
    }

    @Test
    public void testCreateUser() {
        when(userRepository.save(any(User.class))).thenReturn(testUser);

        User newUser = userService.createUser(testUserDto);

        assertNotNull(newUser);
        assertEquals(testUserDto.getCpf(), newUser.getCpf());
        assertEquals(testUserDto.getName(), newUser.getName());
        assertEquals(testUserDto.getDateBirth(), newUser.getDateBirth());
        assertEquals(UserStatusEnum.ATIVO, newUser.getStatus());
    }

    @Test
    public void testDeleteUser() {
        userService.deleteUser(1L);

        verify(userRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testUpdateUser() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(testUser));
        when(userRepository.save(testUser)).thenReturn(testUser);


        User updatedUser = userService.updateUser(1L, testUserDto);

        assertNotNull(updatedUser);
        assertEquals(testUser.getId(), updatedUser.getId());
        assertEquals(testUserDto.getName(), updatedUser.getName());
        assertEquals(UserStatusRecordEnum.UPDATE, updatedUser.getUserInfo().getUserRecord());
    }

    @Test
    public void testDeactivateUser() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(testUser));

        userService.deactivateUser(1L);

        assertEquals(UserStatusEnum.REMOVIDO, testUser.getStatus());
        verify(userRepository, times(1)).save(testUser);
    }

}