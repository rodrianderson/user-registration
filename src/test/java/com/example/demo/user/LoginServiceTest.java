package com.example.demo.user;

import com.example.demo.user.entity.Login;
import com.example.demo.user.entity.User;
import com.example.demo.user.repository.LoginRepository;
import com.example.demo.user.service.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LoginServiceTest {

    @Mock
    private LoginRepository loginRepository;

    @InjectMocks
    private LoginService loginService;

    private Login login;

    @BeforeEach
    void setUp() {
        login = new Login();
        login.setLogin("login");
        login.setPassword("password123");
    }

    @Test
    void testLoadUserByUsername_ExistingUser() {
        when(loginRepository.findByLogin("login")).thenReturn(login);

        UserDetails userDetails = loginService.loadUserByUsername("login");

        assertEquals(login.getLogin(), userDetails.getUsername());
        assertEquals(login.getPassword(), userDetails.getPassword());

        verify(loginRepository, times(1)).findByLogin("login");
    }

    @Test
    void testLoadUserByUsername_NonExistingUser() {
        when(loginRepository.findByLogin("nonExistingUser")).thenReturn(null);

        try {
            loginService.loadUserByUsername("nonExistingUser");
        } catch (UsernameNotFoundException e) {
            assertEquals("User not found with username: nonExistingUser", e.getMessage());
        }
        verify(loginRepository, times(1)).findByLogin("nonExistingUser");
    }
}
