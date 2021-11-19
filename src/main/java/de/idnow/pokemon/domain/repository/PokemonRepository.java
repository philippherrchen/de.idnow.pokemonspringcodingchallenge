package de.idnow.pokemon.domain.repository;

import de.idnow.pokemon.domain.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
