package org.pokemones;

import org.utils.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Crear un método que muestre todos los pokemones de tipo AIRE y que sean hembra");
        final var pokemones = JsonReader.getPokemonList();
        final var pokemonesFiltrados = filtrarPokemonesHembraPorTipo(pokemones, "AIRE");
        System.out.printf("Lista de Pokemones: %s", pokemonesFiltrados);
    }

    private static List<Pokemon> filtrarPokemonesHembraPorTipo(List<Pokemon> listPokemones, String tipo) {
        final var listFiltroPokemones = new ArrayList<Pokemon>();
        for (var pokemon : listPokemones) {
            if (pokemon.getTipo().equals(tipo) && !pokemon.isMacho())
                listFiltroPokemones.add(pokemon);
        }
        return listFiltroPokemones;
    }
}
