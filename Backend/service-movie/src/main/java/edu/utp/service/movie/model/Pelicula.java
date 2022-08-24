package edu.utp.service.movie.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Pelicula {
	
	@Id
	private int id;
	
	private String nombre;
	
	private List<Categoria> Categoria;
	
}
