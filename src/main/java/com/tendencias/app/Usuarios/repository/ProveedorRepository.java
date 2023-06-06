/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;


import com.tendencias.app.usuarios.model.Socios;
import com.tendencias.m5a.usuarios.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */
public interface ProveedorRepository  extends JpaRepository<Proveedores, Integer> {
     @Query(value = "Select * from proveedor u where u.id_proveedor = :id_proveedor", nativeQuery = true)
    public Proveedores buscarProveedor(int id_proveedor);
}
