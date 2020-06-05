package br.com.rodrigorahman.springbootcommysql.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario  extends Pessoa{

    @OneToOne
    private Cargo cargo;

    @ManyToMany
    private List<Perfil> perfis;

    public Cargo getCargo() {
        return cargo;
    }

    @PersistenceContext
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    @PersistenceContext
    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }
}
