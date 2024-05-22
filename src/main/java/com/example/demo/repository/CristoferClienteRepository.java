package com.example.demo.repository;

import com.example.demo.entity.CristoferCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CristoferClienteRepository extends JpaRepository<CristoferCliente, Long> {
    void deleteByDescripcion(String descripcion);
    Optional<CristoferCliente> findByDescripcion(String descripcion);
}