package com.yourcompany.sportxava.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
	

	@Column(length=100)
	@Required
	private String nombre;

	@Column(length=255)
	@Required
	private String descripcion;
	
	@Required
	private float precio;
	
	@Required
	private int stock;
	
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private Collection<ItemCarrito> items;
	
	@ManyToMany(mappedBy = "productos")
	private Collection<Orden> ordenes;
		
	
}
