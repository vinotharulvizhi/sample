package com.test.demo.controller;

import com.test.demo.dto.CommentsResponse;
import com.test.demo.dto.PostsResponse;
import com.test.demo.dto.UsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@RestController
public class AppController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${gorest.get.users}")
    String urlGetUsers;

    @Value("${gorest.get.posts}")
    String urlGetPosts;

    @Value("${gorest.get.comments}")
    String urlGetComments;

    @GetMapping({"/getUsers"})
    public ResponseEntity<UsersResponse> getUsers() {
        return restTemplate.getForEntity(urlGetUsers, UsersResponse.class);
    }

    @GetMapping({"/getPosts"})
    public ResponseEntity<PostsResponse> getPosts() {
        return restTemplate.getForEntity(urlGetPosts, PostsResponse.class);
    }

    @GetMapping({"/getComments"})
    public ResponseEntity<CommentsResponse> getComments() {
        return restTemplate.getForEntity(urlGetPosts, CommentsResponse.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(3000))
                .setReadTimeout(Duration.ofMillis(3000))
                .build();
    }
}
