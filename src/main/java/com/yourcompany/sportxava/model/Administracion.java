package com.yourcompany.sportxava.model;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Administracion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdmin;
	
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
	
	@OneToOne(mappedBy="administracion", cascade=CascadeType.ALL)
	@ReferenceView("Simple")
	private Usuario usuario;

}
