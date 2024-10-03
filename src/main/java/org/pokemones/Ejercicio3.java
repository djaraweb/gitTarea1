package org.pokemones;

import org.utils.JsonReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Crear un método que ordene todos los pokemones de CERULEAN CITY de menor a mayor por su nombre (A->Z)");
        final var pokemones = JsonReader.getPokemonList();
        final var pokemonesFiltrados = filtrarPokemonesPorUbicacion(pokemones, "CERULEAN CITY");

        final var arrayPokemones = transformarListaToArray(pokemonesFiltrados);
        final var arrayPokemonesOrdenados = ordernarPokemonesPorNombreAZ(arrayPokemones);
        System.out.printf("Lista de Pokemones ordenanos : %s", Arrays.toString(arrayPokemonesOrdenados));
    }

    private static List<Pokemon> filtrarPokemonesPorUbicacion(List<Pokemon> listPokemones, String ubicacion) {
        final var listFiltroPokemones = new ArrayList<Pokemon>();
        for (var pokemon : listPokemones) {
            if (pokemon.getUbicacion().equals(ubicacion))
                listFiltroPokemones.add(pokemon);
        }
        return listFiltroPokemones;
    }

    private static Pokemon[] transformarListaToArray(List<Pokemon> listPokemones) {
        final var totalPokemones = listPokemones.size();
        final var pokemones = new Pokemon[totalPokemones];
        for (var i = 0; i < totalPokemones; i++) {
            pokemones[i] = listPokemones.get(i);
        }
        return pokemones;
    }

    private static Pokemon[] ordernarPokemonesPorNombreAZ(Pokemon[] array) {
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getNombre().compareTo(array[j + 1].getNombre()) > 0) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
