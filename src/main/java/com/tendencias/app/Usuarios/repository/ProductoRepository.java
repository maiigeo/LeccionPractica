/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Producto;
import com.tendencias.app.Usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    @Query(value = "Select * from producto u where u.nombre = :nombre", nativeQuery = true)
    public Producto buscarProducto(String nombre);
    
}
