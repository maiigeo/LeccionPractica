/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Usuario;
import com.tendencias.app.Usuarios.model.Venta;
import com.tendencias.app.Usuarios.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public class VentaServiceImpl extends GenericServiceImpl<Venta, Integer> implements GenericService<Venta, Integer> {
    
    @Autowired
    VentaRepository ventaRepository;

    @Override
    public CrudRepository<Venta, Integer> getDao() {
        return ventaRepository;
    }
    
}
