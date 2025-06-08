package com.yourcompany.sportxava.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class ItemCarrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idItemCarrito;
	
	@ManyToOne
	@JoinColumn(name = "carrito_id")
	@DescriptionsList
	private Carrito carrito;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	@DescriptionsList
	private Producto producto;
	
	
	@Required
	private int cantidad;
	
	@Required
	private float subtotal;

}
