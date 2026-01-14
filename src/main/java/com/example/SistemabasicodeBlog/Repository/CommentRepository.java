package com.example.SistemabasicodeBlog.Repository;

import com.example.SistemabasicodeBlog.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comment, Long>{
}
