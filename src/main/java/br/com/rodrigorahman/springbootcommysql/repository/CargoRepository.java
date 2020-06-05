package br.com.rodrigorahman.springbootcommysql.repository;

import br.com.rodrigorahman.springbootcommysql.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {

    Cargo findById(int id);
    Cargo deleteById(int id);
}
