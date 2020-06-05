package br.com.rodrigorahman.springbootcommysql.controller;

import br.com.rodrigorahman.springbootcommysql.model.Perfil;
import br.com.rodrigorahman.springbootcommysql.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PerfilController {

    @Autowired
    PerfilRepository perfilRepository;

    @GetMapping("/perfis")
    public List<Perfil> listarPerfis(){
        return perfilRepository.findAll(Sort.by("nome"));
    }

    @GetMapping("/perfil/{id}")
    public Perfil listarPerfilUnico(@PathVariable(value="id") int id){ return perfilRepository.findById(id); }

    @PostMapping("/perfil")
    public Perfil salvarPerfil(@RequestBody Perfil perfil){
        return perfilRepository.save(perfil);
    }

    @DeleteMapping("/perfil/{id}")
    public void deletarPerfil(@PathVariable(value="id") int id){
        perfilRepository.deleteById(id);
    }

    @PutMapping("/perfil/{id}")
    public void atualizarPerfil(@RequestBody Perfil perfil, @PathVariable(value="id") int id){
        perfilRepository.deleteById(id);
        perfilRepository.save(perfil);
    }
}
