/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HP
 */
public interface AdministradorRepository extends JpaRepository<Administrador, Integer>{
 @Query(value = "Select * from administrador u where u.id_administrador = :id_administrador", nativeQuery = true)
    public Administrador buscarAdministrador(int id_administrador);  
}
