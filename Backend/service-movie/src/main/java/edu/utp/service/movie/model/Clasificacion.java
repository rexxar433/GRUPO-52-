package edu.utp.service.movie.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="clasificacion")
public class Clasificacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="Por favor agregue un nombre a la clasficacion.")
    @Size(max=45, message="No se puede colocar un nombre tan largo.")
    private String nombre;

    @Max(value=130, message = "La edad minima no es valida.")
    @Column(name="edad_minima")
    private String edadMinima;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(String edadMinima) {
        this.edadMinima = edadMinima;
    }
}
