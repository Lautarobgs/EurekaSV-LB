package com.microservicios.usersservice.repository;

import com.microservicios.usersservice.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="posts-service")
public interface IPostApi {
    @GetMapping("/posts/{user_id}")
    List<PostDTO> getPostsByUserId(@PathVariable Long user_id);
}
