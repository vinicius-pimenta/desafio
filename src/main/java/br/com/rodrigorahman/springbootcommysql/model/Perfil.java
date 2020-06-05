package br.com.rodrigorahman.springbootcommysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPerfil;

    @ManyToMany
    private List<Usuario> usuarios;

    @Column(nullable = false, unique = true)
    private String nome;

    public int getId(){
        return idPerfil;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}