/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.usuarios.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tendencias.app.Usuarios.model.Rol;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
public class Socios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_socio")
    private int id_socio;
    
//    @ManyToOne
//    @JoinColumn(name = "id_rol",referencedColumnName = "id_rol")
//    private Rol rol;
    
    
    
}
