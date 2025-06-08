package com.yourcompany.sportxava.model;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter

public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer idOrdenes;
	
	@Required
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	@DescriptionsList
	private Usuario usuario;
	
	@ManyToMany
	@JoinTable(
			name = "orden_producto",
			joinColumns = @JoinColumn(name = "orden_id"),
			inverseJoinColumns = @JoinColumn(name = "producto_id"))
	@DescriptionsList
	private Collection<Producto> productos;
	
	@Required
	private float total;
	

}
