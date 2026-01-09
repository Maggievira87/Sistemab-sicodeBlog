package com.example.SistemabasicodeBlog.controller;

import com.example.SistemabasicodeBlog.Model.Posteo;
import com.example.SistemabasicodeBlog.Service.IservicePosteo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {

    private final IservicePosteo posteoService;


    public PosteoController(IservicePosteo posteoService) {
        this.posteoService = posteoService;
    }


    @GetMapping
    public List<Posteo> getAll() {
        return posteoService.findAll();
    }


    @GetMapping("/{id}")
    public Posteo getById(@PathVariable Long id) {
        return posteoService.findById(id);
    }


    @PostMapping("/crear")
    public String crearPosteo(@RequestBody Posteo posteo) {
        posteoService.save(posteo);
        return "Posteo creado correctamente";
    }
}