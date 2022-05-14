package br.edu.fatecfranca.apidb.model.repositories;

import br.edu.fatecfranca.apidb.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
