package com.microservicios.postsservice.service;

import com.microservicios.postsservice.model.Post;

import java.util.List;

public interface IPostService {
    List<Post> getPostsByUser(Long user_id);
}
