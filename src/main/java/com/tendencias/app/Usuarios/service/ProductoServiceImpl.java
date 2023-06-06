/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.Usuarios.repository.UsuarioRepository;
import com.tendencias.app.Usuarios.model.Producto;
import com.tendencias.app.Usuarios.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements GenericService<Producto, Integer> {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public CrudRepository<Producto, Integer> getDao() {
        return (CrudRepository<Producto, Integer>) productoRepository;
    }
}
