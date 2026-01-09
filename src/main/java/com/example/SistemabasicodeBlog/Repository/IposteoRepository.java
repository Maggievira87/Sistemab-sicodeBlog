package com.example.SistemabasicodeBlog.Repository;

import com.example.SistemabasicodeBlog.Model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IposteoRepository extends JpaRepository<Posteo, Long> {
}

