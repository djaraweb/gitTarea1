package org.pokemones;

import org.utils.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Crear un método que sume las defensas de 2 pokemones en base a su ID");
        final var pokemones = JsonReader.getPokemonList();

        final var mapPokemones = convertirHashMap(pokemones);
        final var pokemon1 = mapPokemones.get("PKM-348");
        final var pokemon2 = mapPokemones.get("PKM-350");
        final var sumaDefensas = pokemon1.getDefensa() + pokemon2.getDefensa();

        System.out.printf("Pokemon1 : %s%n Pokemon2 : %s", pokemon1, pokemon2);
        System.out.printf("La Suma de las defensas de los pokemones es : %.2f", sumaDefensas);
    }

    private static Map<String, Pokemon> convertirHashMap(List<Pokemon> listPokemones) {
        final var mapPokemones = new HashMap<String, Pokemon>();
        for (var pokemon : listPokemones) {
            mapPokemones.put(pokemon.getId(), pokemon);
        }
        return mapPokemones;
    }
}
