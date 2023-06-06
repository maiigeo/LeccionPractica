/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Compra;
import com.tendencias.app.Usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */
public interface CompraRepository extends JpaRepository<Compra, Integer>{
     @Query(value = "Select * from compra u where u.id_compra = :id_compra", nativeQuery = true)
    public Compra buscarCompra(int id_compra);
    
}
