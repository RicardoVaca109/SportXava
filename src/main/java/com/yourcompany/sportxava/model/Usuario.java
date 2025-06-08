package com.yourcompany.sportxava.model;

import java.util.*;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(length=50)
	@Required
	private String nombre;
	
	@Column(length=100, unique=true)
	@Required
	private String correo;
	
	@Column(length=250)
	@Required
	@Stereotype("PASSWORD")
	private String contrasenia;
		
	@OneToOne
    @DescriptionsList
	private Administracion administracion;
	
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@ListProperties("id")
	private Collection<Carrito> carritos;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private Collection<Orden> ordenes;
	
}
