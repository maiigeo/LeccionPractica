/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Compra;
import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.Usuarios.repository.CompraRepository;
import com.tendencias.app.Usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public class CompraServiceImpl extends GenericServiceImpl<Compra, Integer> implements GenericService<Compra, Integer> {

    @Autowired
    CompraRepository compraRepository;

    @Override
    public CrudRepository<Compra, Integer> getDao() {
        return (CrudRepository<Compra, Integer>) compraRepository;
    }
    
}
