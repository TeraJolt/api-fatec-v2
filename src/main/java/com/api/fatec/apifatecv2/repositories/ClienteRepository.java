package com.api.fatec.apifatecv2.repositories;

import com.api.fatec.apifatecv2.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
