package com.leonardo.ec.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @Column(name= "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @Column(name= "nombre")
    private String nombre;
    private String apellido;
    @Column(name= "apellido")
    private String correo;
    @Column(name= "fecha-registro")
    private Date fechaRegistro;




}
