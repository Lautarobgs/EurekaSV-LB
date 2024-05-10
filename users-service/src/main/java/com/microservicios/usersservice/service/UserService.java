package com.microservicios.usersservice.service;

import com.microservicios.usersservice.dto.PostDTO;
import com.microservicios.usersservice.dto.UserDTO;
import com.microservicios.usersservice.model.User;
import com.microservicios.usersservice.repository.IPostApi;
import com.microservicios.usersservice.repository.IUserRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepo;
    @Autowired
    private IPostApi apiPosts;
    @Override
    public UserDTO getUserAndPost(Long user_id) {
        ///Datos del user en la DB
        User user = userRepo.findById(user_id).orElse(null);
        ///Datos de los posts
        ///Traigo posts de la api
        List<PostDTO> postslist = apiPosts.getPostsByUserId(user_id);
        /// Unificar datos con UserDTO
        UserDTO userDTO = new UserDTO(user.getUser_id(),user.getName(),user.getLastname(),
                                      user.getCellphone(),postslist);

        return userDTO;
    }
}
