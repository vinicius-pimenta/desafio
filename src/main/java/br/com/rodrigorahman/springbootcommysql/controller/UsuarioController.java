package br.com.rodrigorahman.springbootcommysql.controller;

import br.com.rodrigorahman.springbootcommysql.model.Usuario;
import br.com.rodrigorahman.springbootcommysql.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll(Sort.by("nome"));
    }

    @GetMapping("/usuario/{id}")
    public Usuario listarUsuariolUnico(@PathVariable(value="id") int id){
        return usuarioRepository.findById(id);
    }

    @PostMapping("/usuario")
    public Usuario salvarUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void deletarUsuario(@PathVariable(value="id") int id){
        usuarioRepository.deleteById(id);
    }

    @PutMapping("/usuario/{id}")
    public void atualizarUsuario(@RequestBody Usuario usuario, @PathVariable(value="id") int id){
        usuarioRepository.deleteById(id);
        usuarioRepository.save(usuario);
    }
}
