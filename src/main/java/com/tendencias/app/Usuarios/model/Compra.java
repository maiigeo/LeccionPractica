/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private int id_compra;
    
    @Column(name = "fecha")
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente",referencedColumnName = "id_cliente")
    private Cliente cliente;
    
    @JsonIgnore
    @OneToMany(mappedBy = "compra")
    private List<Producto>listaProducto;
    
    
    
}
