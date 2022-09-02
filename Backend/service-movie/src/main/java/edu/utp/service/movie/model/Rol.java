package edu.utp.service.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="rol")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="role")
    private String role;

    @OneToMany(mappedBy = "rol",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Usuario> usuarios;

    public void agregarUsuarios(Usuario usuario){
        if(usuario==null){
            usuarios=new ArrayList<>();
        }
        usuarios.add(usuario);

        usuario.setRol(this);
    }
}
