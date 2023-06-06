/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.controller;

import com.tendencias.app.Usuarios.model.Compra;
import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.Usuarios.service.CompraServiceImpl;
import com.tendencias.app.Usuarios.service.UsuarioServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author HP
 */
public class CompraController {
     @Autowired
    CompraServiceImpl compraService;

    @Operation(summary = "Se obtiene la lista ")
    @GetMapping("/listar")
    public ResponseEntity<List<Compra>> listaCompras() {
        return new ResponseEntity<>(compraService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos ")
    @PostMapping("/crear")
    public ResponseEntity<Compra> crearCompra(@RequestBody Compra u) {
        return new ResponseEntity<>(compraService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Integer id, @RequestBody Usuario u) {
        Compra compra = compraService.findById(id);
        if (compra != null) {
            try {
                compra.setCliente(u.getCedula());

                
                return new ResponseEntity<>(compraService.save(compra), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
