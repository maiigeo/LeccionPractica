/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.app.Usuarios.model;

import com.tendencias.m5a.usuarios.model.Proveedores;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


/**
 *
 * @author 59398
 */

@Data
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id_usuario;

    @Size(min = 3, max = 10, message = "El usuario debe tener entre 3 y 10 caracteres")
    @NotBlank(message = "El usuario no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;

    @NotBlank(message = "El usuario no puede estar en blanco")
    @Column(name = "apellido")
    private String apellido;

    @NotBlank(message = "La cedula no puede estar en blanco")
    @Column(name = "cedula")
    private String cedula;

    @NotBlank(message = "Debe ingresar una dirección ")
    @Column(name = "direccion")
    private String direccion;

    @NotBlank(message = "El celular no puede estar en blanco")
    @Column(name = "celular")
    private String celular;

    @NotBlank(message = "El correo no puede estar en blanco")
    @Column(name = "correo")
    private String correo;

    @NotBlank(message = "La clave no puede estar en blanco")
    @Column(name = "clave")
    private String clave;

//    @ManyToOne
//    @JoinColumn(name = "id_administrador", referencedColumnName = "id_administrador")
//    private Administrador administrador;
//
//    @ManyToOne
//    @JoinColumn(name = "id_socio", referencedColumnName = "id_socio")
//    private Socios socio;
//
//    @ManyToOne
//    @JoinColumn(name = "id_cliente", referencedColumnName = "id_persona")
//    private Cliente cliente;
//    
//    @ManyToOne
//    @JoinColumn(name = "id_proveedor",referencedColumnName = "id_proveedor")
//    private Proveedores proveedores;
    
    @ManyToOne
    @JoinColumn(name = "id_rol",referencedColumnName = "id_rol")
    private Rol rol;
}

