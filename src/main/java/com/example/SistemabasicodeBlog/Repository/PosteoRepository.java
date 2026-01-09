package com.example.SistemabasicodeBlog.Repository;

import com.example.SistemabasicodeBlog.Model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IposteoRepository {

    private final List<Posteo> posteos = new ArrayList<>();

    public PosteoRepository() {
        posteos.add(new Posteo(1L, "Primer post", "Ana"));
        posteos.add(new Posteo(2L, "Segundo post", "Luis"));
    }

    @Override
    public List<Posteo> findAll() {
        return List.of();
    }

    @Override
    public Posteo findById(Long id) {
        return null;
    }

    @Override
    public void save(Posteo posteo) {

    }
}
