package org.pokemones;

import org.utils.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Crear un método que a todos los pokemons les aumentes es el hp en 500 y retorna la nueva lista");
        final var pokemones = JsonReader.getPokemonList();
        final var pokemonesConHPActualizado = aumentarHPenPokemon(pokemones, 500);

        System.out.printf("Lista de Pokemones con HP aumentado : %s", pokemonesConHPActualizado);
    }

    private static List<Pokemon> aumentarHPenPokemon(List<Pokemon> listPokemones, int incrementoHp) {
        final var listPokemonesActualizados = new ArrayList<Pokemon>();
        for (var pokemon : listPokemones) {
            pokemon.setHp(pokemon.getHp() + incrementoHp);
            listPokemonesActualizados.add(pokemon);
        }
        return listPokemonesActualizados;
    }
}
