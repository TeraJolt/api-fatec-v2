package com.api.fatec.apifatecv2.controllers;

import com.api.fatec.apifatecv2.entities.Cliente;
import com.api.fatec.apifatecv2.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cliente/v1")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    //Retorna todos os Clientes
    @GetMapping
    public List<Cliente> findAll(){
        return repository.findAll();
    }

    //Retorna Clientes por ID
    @GetMapping("{id}")
    public Cliente findById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @PutMapping("{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente){
        cliente.setId(id);
        return repository.save(cliente);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
