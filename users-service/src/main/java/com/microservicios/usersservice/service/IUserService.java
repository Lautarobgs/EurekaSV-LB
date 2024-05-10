package com.microservicios.usersservice.service;

import com.microservicios.usersservice.dto.UserDTO;

public interface IUserService {
UserDTO getUserAndPost(Long user_id);

}
