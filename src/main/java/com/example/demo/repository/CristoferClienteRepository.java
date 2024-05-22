package com.example.demo.repository;

import com.example.demo.entity.CristoferCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CristoferClienteRepository extends JpaRepository<CristoferCliente, Long> {
    
    void deleteByDescripcion(String descripcion);

}