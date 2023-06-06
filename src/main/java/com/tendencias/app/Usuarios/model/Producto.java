/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import com.tendencias.app.Usuarios.model.Compra;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;

    @Size(min = 3, max = 10, message = "El nombre debe tener entre 3 y 10 caracteres")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;
    
    @NotBlank(message = "La descripcion no puede estar en blanco")
    @Column(name = "descripcion")
    private String descripcion;
    
    @NotBlank(message = "El precio no puede estar en blanco")
    @Column(name = "precioemp")
    private String precioemp;
    
    @Column(name = "talla")
    private String talla;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @ManyToOne
    @JoinColumn(name = "id_compra",referencedColumnName = "id_compra")
    private Compra compra;

}
