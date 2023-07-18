package com.adriano.workshopmongo.resource;

import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/users")
public class UserResources {

    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> userList(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.userList());
    }
}
