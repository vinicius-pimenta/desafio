package br.com.rodrigorahman.springbootcommysql.repository;

import br.com.rodrigorahman.springbootcommysql.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findById(int id);
}
