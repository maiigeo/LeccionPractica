/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.controller;

import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.Usuarios.model.Venta;
import com.tendencias.app.Usuarios.service.UsuarioServiceImpl;
import com.tendencias.app.Usuarios.service.VentaServiceImpl;
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
public class VentaController {
     @Autowired
    VentaServiceImpl ventaService;

    @Operation(summary = "Se obtiene la lista ")
    @GetMapping("/listar")
    public ResponseEntity<List<Venta>> listaVenta() {
        return new ResponseEntity<>(ventaService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos ")
    @PostMapping("/crear")
    public ResponseEntity<Venta> crearVenta(@RequestBody Venta u) {
        return new ResponseEntity<>(ventaService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Venta> actualizarUsuario(@PathVariable Integer id, @RequestBody Venta u) {
        Venta venta = ventaService.findById(id);
        if (venta != null) {
            try {
                venta.setCantidad(u.getCantidad());
                venta.setPreciovent(u.getPreciovent());
                venta.setPvp(u.getPvp());
                return new ResponseEntity<>(ventaService.save(venta), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Usuario> elimiarUsuario(@PathVariable Integer id) {
        ventaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
