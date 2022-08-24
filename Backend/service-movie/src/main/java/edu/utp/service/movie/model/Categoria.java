package edu.utp.service.movie.model;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Categoria {
	
	@Id
	private int id;
	
	private String nombre;
	
	
}
