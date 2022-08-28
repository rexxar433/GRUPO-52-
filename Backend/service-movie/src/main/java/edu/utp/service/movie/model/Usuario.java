package edu.utp.service.movie.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=45, message="El nombre no es valido")
    @Column(name="primer_nombre")
    private String primerNombre;

    @Size(min=1, max=45, message="El segundo nombre no es valido")
    @Column(name="segundo_nombre")
    private String segundoNombre;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=45, message="El apellido no es valido")
    private String primerApellido;

    @Size(min=1, max=45, message="El segundo apellido no es valido")
    @Column(name="segundo_nombre")
    private String segundoApellido;

    @Column(name="fecha_nacimiento")
    private Date nacimiento;

    private int edad;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=70, message="El segundo apellido no es valido")
    @Email(message="No es un correo valido. ")
    private String email;

    @NotEmpty(message="Por favor agregue un titulo")
    @Size(min=1, max=45, message="La contraseña no es valida")
    private String contrasena;

    @Column(name="rol_id")
    private int rolId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
}
