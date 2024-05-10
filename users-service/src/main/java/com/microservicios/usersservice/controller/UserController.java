package com.microservicios.usersservice.controller;

import com.microservicios.usersservice.dto.UserDTO;
import com.microservicios.usersservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userServ;

    @GetMapping("/posts/{user_id}")
    public UserDTO getUserandPosteos(@PathVariable Long user_id){
        return userServ.getUserAndPost(user_id);
    }
}
