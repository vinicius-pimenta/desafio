package br.com.rodrigorahman.springbootcommysql.controller;

import br.com.rodrigorahman.springbootcommysql.model.Cargo;
import br.com.rodrigorahman.springbootcommysql.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CargoController {

    @Autowired
    CargoRepository cargoRepository;

    @GetMapping("/cargos")
    public List<Cargo> listarCargos(){
        return cargoRepository.findAll(Sort.by("nome"));
    }

    @GetMapping("/cargo/{id}")
    public Cargo listarCargoUnico(@PathVariable(value="id") int id){
        return cargoRepository.findById(id);
    }

    @PostMapping("/cargo")
    public Cargo salvarCargo(@RequestBody Cargo cargo){
        return cargoRepository.save(cargo);
    }

    @DeleteMapping("/cargo/{id}")
    public void deletarCargo(@PathVariable(value="id") int id){
        cargoRepository.deleteById(id);
    }

    @PutMapping("/cargo/{id}")
    public void atualizarCargo(@RequestBody Cargo cargo, @PathVariable(value="id") int id){
        cargoRepository.deleteById(id);
        cargoRepository.save(cargo);
    }

    public Cargo encontrarCargo(int id) {
        return cargoRepository.findById(id);
    }
}
