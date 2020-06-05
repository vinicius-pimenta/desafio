package br.com.rodrigorahman.springbootcommysql.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCargo;

    @Column(nullable = false, unique = true)
    private String nome;

    public int getId(){
        return idCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}