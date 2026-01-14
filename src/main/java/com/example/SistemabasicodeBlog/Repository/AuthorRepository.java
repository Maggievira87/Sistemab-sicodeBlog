package com.example.SistemabasicodeBlog.Repository;

import com.example.SistemabasicodeBlog.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
