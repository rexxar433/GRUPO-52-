package edu.utp.service.movie.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name="pelicula")
public class Pelicula implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message="Por favor agregue un titulo")
	@Size(max=45, message="No se puede colocar un nombre tan largo.")
	private String titulo;

	@NotEmpty(message="Por favor agregue un argumento o sinopsis de la pelicula.")
	private String argumento;

	@Min(value=1, message="La duracion no tiene un valor permitido.")
	private int duracion;

	@Min(value=1, message="el año no tiene un valor permitido.")
	private int ano;


	private double puntuacion;

	//private image imagen;

	//Relacion muchas a uno
	@Column(name="clasificacion_id")
	private int clasificacionId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArgumento() {
		return argumento;
	}

	public void setArgumento(String argumento) {
		this.argumento = argumento;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getClasificacionId() {
		return clasificacionId;
	}

	public void setClasificacionId(int clasificacionId) {
		this.clasificacionId = clasificacionId;
	}
}
