package com.microservicios.postsservice.controller;

import com.microservicios.postsservice.model.Post;
import com.microservicios.postsservice.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private IPostService postServ;

    @Value("${server.port}") ///Anotacion para agarrar un valor del application propierties
    private int serverPort;
    @GetMapping("/{user_id}")
    public List<Post> getPosts(@PathVariable Long user_id){
        System.out.println("uwuwuwuwuwuwuwuwuwu puerto "+ serverPort);
        return postServ.getPostsByUser(user_id);
    }
}
