package com.adriano.workshopmongo.services;

import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public List<User> userList() {
        return userRepository.findAll();
    }
}
