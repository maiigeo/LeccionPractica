/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;


import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.usuarios.model.Socios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */

public interface SocioRepository extends JpaRepository<Socios, Integer> {
     @Query(value = "Select * from socio u where u.nombre = :nombre", nativeQuery = true)
    public Socios buscarSocio(String nombre);
    
}
