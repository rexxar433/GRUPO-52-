package edu.utp.service.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=45, message="El nombre no es valido")
    @Column(name="primer_nombre")
    private String primerNombre;

    @Size(min=1, max=45, message="El segundo nombre no es valido")
    @Column(name="segundo_nombre")
    private String segundoNombre;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=45, message="El apellido no es valido")
    @Column(name="primer_apellido")
    private String primerApellido;

    @Size(min=1, max=45, message="El segundo apellido no es valido")
    @Column(name="segundo_apellido")
    private String segundoApellido;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="fecha_nacimiento")
    private Date nacimiento;

    private Integer edad;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=70, message="El segundo apellido no es valido")
    @Email(message="No es un correo valido. ")
    private String email;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=45, message="La contraseña no es valida")
    private String contrasena;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="rol_id")
    private Rol rol;

    @OneToMany(mappedBy = "usuario",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Opinion> opiniones;

    public void agregarOpiniones(Opinion opinion){
        if(opiniones==null){
            opiniones=new ArrayList<>();
        }
        opiniones.add(opinion);

        opinion.setUsuario(this);
    }

}
