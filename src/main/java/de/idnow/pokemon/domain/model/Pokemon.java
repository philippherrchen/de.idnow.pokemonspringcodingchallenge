package de.idnow.pokemon.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
import lombok.Data;

@Entity
@Table(name = "POKEMONS")
@Data
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "photo")
	private int photo;

	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "type")
	@Enumerated
	private PokemonType pokemonType;

	@Column(name = "height")
	@NotNull
	private int height;

	@Column(name = "weight")
	@NotNull
	private int weight;

	@Column(name = "description")
	private String description;
}
