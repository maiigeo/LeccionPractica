/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Cliente;
import com.tendencias.app.Usuarios.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
     @Query(value = "Select * from cliente u where u.id_cliente = :id_cliente", nativeQuery = true)
    public Cliente buscarCliente(int id_cliente);
    
}
