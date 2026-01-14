package com.example.SistemabasicodeBlog.Service;

import com.example.SistemabasicodeBlog.Model.Author;
import com.example.SistemabasicodeBlog.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repo;

    public AuthorService(AuthorRepository repo) {
        this.repo = repo;
    }

    public Author save(Author a) {
        return repo.save(a);
    }

    public List<Author> findAll() {
        return repo.findAll();
    }

    public Author findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Autor no encontrado"));
    }
}

