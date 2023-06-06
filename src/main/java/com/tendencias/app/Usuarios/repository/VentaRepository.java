/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.Usuarios.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */
public interface VentaRepository extends JpaRepository<Venta, Integer>{
    @Query(value = "Select * from venta u where u.id_venta = :id_venta", nativeQuery = true)
    public Usuario buscarVenta(int id_venta);
    
}
