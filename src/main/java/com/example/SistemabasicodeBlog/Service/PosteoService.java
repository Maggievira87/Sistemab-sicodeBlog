package com.example.SistemabasicodeBlog.Service;

import com.example.SistemabasicodeBlog.Model.Posteo;
import com.example.SistemabasicodeBlog.Repository.IposteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo {

    private final IposteoRepository posteoRepository;

    public PosteoService(IposteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> findAll() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo findById(Long id) {
        return posteoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado"));
    }

    @Override
    public Posteo save(Posteo posteo) {
        return posteoRepository.save(posteo);
    }
}