package com.example.SistemabasicodeBlog.Service;

import com.example.SistemabasicodeBlog.Model.Comment;
import com.example.SistemabasicodeBlog.Model.Posteo;
import com.example.SistemabasicodeBlog.Repository.CommentRepository;
import com.example.SistemabasicodeBlog.Repository.IposteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository repo;
    private final PosteoService posteoService;

    public CommentService(CommentRepository repo, PosteoService posteoService) {
        this.repo = repo;
        this.posteoService = posteoService;
    }

    public Comment addToPost(Long postId, Comment comment) {
        Posteo post = posteoService.findById(postId);

        comment.setPosteo(post);
        return repo.save(comment);
    }

    public List<Comment> findAll() {
        return repo.findAll();
    }


}
