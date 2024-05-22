package com.example.demo.service;

import com.example.demo.entity.CristoferCliente;
import com.example.demo.repository.CristoferClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CristoferClienteService {

    @Autowired
    private CristoferClienteRepository repository;

    public List<CristoferCliente> getAll() {
        return repository.findAll();
    }

    public CristoferCliente save(CristoferCliente cliente) {
        return repository.save(cliente);
    }

    public void deleteByDescripcion(String descripcion) {
        repository.deleteByDescripcion(descripcion);
    }
}