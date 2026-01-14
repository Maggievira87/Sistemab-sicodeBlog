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


    public Posteo save(Posteo posteo) {
        return posteoRepository.save(posteo);
    }


    public List<Posteo> findAll() {
        return posteoRepository.findAll();
    }


    public Posteo findById(Long id) {
        return posteoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado con id: " + id));
    }

    public Posteo update(Long id, Posteo posteoNuevo) {
        Posteo posteoExistente = posteoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado con id: " + id));

        posteoExistente.setTitulo(posteoNuevo.getTitulo());
        posteoExistente.setContenido(posteoNuevo.getContenido());

        return posteoRepository.save(posteoExistente);
    }


    public void delete(Long id) {
        Posteo posteo = posteoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado con id: " + id));

        posteoRepository.delete(posteo);
    }
}