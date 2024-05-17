package com.api.fatec.apifatecv2.controllers;

import com.api.fatec.apifatecv2.entities.PedidoVenda;
import com.api.fatec.apifatecv2.repositories.PedidoVendaRepository;
import com.api.fatec.apifatecv2.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/api/pedido-venda/v1")
public class PedidoVendaController {

@Autowired
    private PedidoVendaRepository repository;
    private ProdutoRepository produtoRepository;

@PostMapping
    public PedidoVenda salvar(@RequestBody PedidoVenda pedidoVenda) {
    pedidoVenda.setEmissao(LocalDate.now());
    pedidoVenda.addItem(pedidoVenda.getItens());
    return repository.save(pedidoVenda);

    }

@GetMapping
    public List<PedidoVenda> listar() {
        return repository.findAll();
    }

@GetMapping("{id}")
    public PedidoVenda buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
@GetMapping("pesquisa-por-data/{emissao}")
    public List<PedidoVenda> buscarPorData(@PathVariable LocalDate emissao) {
        return repository.findByEmissao(emissao);
}

@GetMapping("pesquisa-por-cliente/{nome}")
    public List<PedidoVenda> buscarPorCliente(@PathVariable String nome) {
        return repository.findByClienteNomeContainingIgnoreCase(nome);
}

@GetMapping("pesquisa-por-produto/{descricao}")
    public List<PedidoVenda> buscarPorProduto(@PathVariable String descricao) {
        return repository.findByItensProdutoDescricaoContainingIgnoreCase(descricao);
}
@PutMapping("{id}")
    private PedidoVenda atualizar(@PathVariable Long id, @RequestBody PedidoVenda pedidoVenda) {
    pedidoVenda.setId(id);
    pedidoVenda.setEmissao(LocalDate.now());
    pedidoVenda.addItem(pedidoVenda.getItens());
    return repository.save(pedidoVenda);
    }

@DeleteMapping("{id}")
    public void remover(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
