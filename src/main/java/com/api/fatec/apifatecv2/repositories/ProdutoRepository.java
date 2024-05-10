package com.api.fatec.apifatecv2.repositories;

import com.api.fatec.apifatecv2.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
