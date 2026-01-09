package com.example.SistemabasicodeBlog.Service;

import com.example.SistemabasicodeBlog.Model.Posteo;

import java.util.List;

public interface IservicePosteo {

    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}
