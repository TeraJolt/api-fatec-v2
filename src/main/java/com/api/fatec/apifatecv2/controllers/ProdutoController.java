package com.api.fatec.apifatecv2.controllers;

import com.api.fatec.apifatecv2.entities.Produto;
import com.api.fatec.apifatecv2.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/produto/v1")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> findAll(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Produto findById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return repository.save(produto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
