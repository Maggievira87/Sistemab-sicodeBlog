package com.example.SistemabasicodeBlog.controller;

import com.example.SistemabasicodeBlog.Model.Author;
import com.example.SistemabasicodeBlog.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/authors")

public class AuthorController {

        private final AuthorService service;

        public AuthorController(AuthorService service) {
            this.service = service;
        }

        @PostMapping
        public Author create(@RequestBody Author a) {
            return service.save(a);
        }

        @GetMapping
        public List<Author> list() {
            return service.findAll();
        }
    }


