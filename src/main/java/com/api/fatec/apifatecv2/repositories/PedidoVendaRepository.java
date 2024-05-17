package com.api.fatec.apifatecv2.repositories;

import com.api.fatec.apifatecv2.entities.Cliente;
import com.api.fatec.apifatecv2.entities.PedidoVenda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PedidoVendaRepository extends JpaRepository<PedidoVenda, Long> {
    List<PedidoVenda> findByEmissao(LocalDate emissao);
    List<PedidoVenda> findByClienteNomeContainingIgnoreCase(String nome);
    List<PedidoVenda> findByItensProdutoDescricaoContainingIgnoreCase(String descricao);

}
