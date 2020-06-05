package br.com.rodrigorahman.springbootcommysql.repository;

import br.com.rodrigorahman.springbootcommysql.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

    Perfil findById(int id);
    Perfil deleteById(int id);
}