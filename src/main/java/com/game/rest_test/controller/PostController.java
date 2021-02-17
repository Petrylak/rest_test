package com.game.rest_test.controller;

import com.game.rest_test.model.Post;
import com.game.rest_test.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController
{
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getPosts()
    {
        return postService.getPost();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getSinglePosts(@PathVariable long id)
    {
        return postService.getSinglePost(id);
    }
}
