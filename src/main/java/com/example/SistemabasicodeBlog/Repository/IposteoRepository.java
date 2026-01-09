package com.example.SistemabasicodeBlog.Repository;

import com.example.SistemabasicodeBlog.Model.Posteo;
import java.util.List;

public interface IposteoRepository {

    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}

