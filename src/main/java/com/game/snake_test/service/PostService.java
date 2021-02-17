package com.game.snake_test.service;

import com.game.snake_test.model.Post;
import com.game.snake_test.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService
{
    private final PostRepository postRepository;

    @Autowired
    public PostService(final PostRepository postRepository)
    {
        this.postRepository = postRepository;
    }


    public List<Post> getPost()
    {
      return postRepository.findAll();
    }

    public Optional<Post> getSinglePost(long id)
    {
            return postRepository.findById(id);
    }
}
