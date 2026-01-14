package com.example.SistemabasicodeBlog.controller;

import com.example.SistemabasicodeBlog.Model.Posteo;
import com.example.SistemabasicodeBlog.Service.IservicePosteo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {

    private final IservicePosteo service;

    public PosteoController(IservicePosteo service) {
        this.service = service;
    }

    @PostMapping
    public Posteo crear(@RequestBody Posteo posteo) {
        return service.save(posteo);
    }

    @GetMapping
    public List<Posteo> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Posteo obtener(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Posteo actualizar(@PathVariable Long id, @RequestBody Posteo posteo) {
        return service.update(id, posteo);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        service.delete(id);
        return "Post eliminado";
    }
}
