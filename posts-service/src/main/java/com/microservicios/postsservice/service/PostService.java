package com.microservicios.postsservice.service;

import com.microservicios.postsservice.model.Post;
import com.microservicios.postsservice.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService{
    @Autowired
    private IPostRepository postRepo;
    @Override
    public List<Post> getPostsByUser(Long user_id) {
        return postRepo.findPostByUserId(user_id);
    }
}
