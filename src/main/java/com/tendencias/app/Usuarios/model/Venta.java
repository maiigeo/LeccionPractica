/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int id_venta;
    
    @NotBlank(message = "La cantidad no puede estar en blanco")
    @Column(name = "cantidad")
    private int cantidad;
    
    @NotBlank(message = "El precio no puede estar en blanco")
    @Column(name = "precioventa")
    private double preciovent;
    
    @NotBlank(message = "La utilidad no puede estar en blanco")
    @Column(name = "utilidad")
    private double utilidad;
    
    @NotBlank(message = "La utilidad no puede estar en blanco")
    @Column(name = "PVP")
    private Double pvp=utilidad*preciovent;
    
    
    
    
    
    
    
    
    
    
}
