package com.yourcompany.sportxava.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Carrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCarrito;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	@DescriptionsList
	private Usuario usuario;
	
	@OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL)
	private Collection<ItemCarrito> items;
}
