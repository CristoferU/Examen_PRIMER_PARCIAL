package com.example.demo.controller;

import com.example.demo.entity.CristoferCliente;
import com.example.demo.service.CristoferClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cristofer-clientes")
public class CristoferClienteController {

    @Autowired
    private CristoferClienteService service;

    @ApiOperation("Obtiene todos los clientes")
    @GetMapping
    public List<CristoferCliente> getAll() {
        return service.getAll();
    }

    @ApiOperation("Guarda un nuevo cliente")
    @PostMapping
    public CristoferCliente save(@RequestBody CristoferCliente cliente) {
        return service.save(cliente);
    }

    @ApiOperation("Borra un cliente por la descripción")
    @DeleteMapping("/{descripcion}")
    public void deleteByDescripcion(@PathVariable String descripcion) {
        service.deleteByDescripcion(descripcion);
    }
}