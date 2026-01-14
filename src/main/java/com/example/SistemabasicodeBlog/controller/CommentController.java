package com.example.SistemabasicodeBlog.controller;

import com.example.SistemabasicodeBlog.Model.Comment;
import com.example.SistemabasicodeBlog.Service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")

public class CommentController {
        private final CommentService service;

        public CommentController(CommentService service) {
            this.service = service;
        }

        @PostMapping("/post/{postId}")
        public Comment add(@PathVariable Long postId, @RequestBody Comment c) {
            return service.addToPost(postId, c);
        }

        @GetMapping
        public List<Comment> list() {
            return service.findAll();
        }
    }
