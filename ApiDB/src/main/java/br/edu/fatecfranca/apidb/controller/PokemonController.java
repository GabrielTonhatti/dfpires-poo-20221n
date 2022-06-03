package br.edu.fatecfranca.apidb.controller;

import br.edu.fatecfranca.apidb.model.Pokemon;
import br.edu.fatecfranca.apidb.model.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping
    @CrossOrigin(origins="*")
    public List<Pokemon> get() {
        return pokemonRepository.findAll();
    }

    @PostMapping
    @CrossOrigin(origins="*")
    public Pokemon add(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @PutMapping
    @CrossOrigin(origins="*")
    public Pokemon updates(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @DeleteMapping("{id}")
    @CrossOrigin(origins="*")
    public String delete(@PathVariable Long id) {
        try {
            pokemonRepository.deleteById(id);
            return "Remoção com sucesso!";
        } catch (Exception e) {
            return "Pokemon não encontrado para remoção";
        }
    }

}
