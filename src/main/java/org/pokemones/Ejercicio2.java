package org.pokemones;

import org.utils.JsonReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Crear un método que ordene todos los pokemones de tipo ELECTRICIDAD por su nivel de mayor a menor");
        final var pokemones = JsonReader.getPokemonList();
        final var pokemonesFiltrados = filtrarPokemonesPorTipo(pokemones, "ELECTRICIDAD");

        final var arrayPokemones = transformarListaToArray(pokemonesFiltrados);
        final var arrayPokemonesOrdenados = ordernarPokemonesPorNivelMayorAMenor(arrayPokemones);
        System.out.printf("Lista de Pokemones ordenanos por nivel y filtrados por tipo : %s", Arrays.toString(arrayPokemonesOrdenados));
    }

    private static List<Pokemon> filtrarPokemonesPorTipo(List<Pokemon> listPokemones, String tipo) {
        final var listFiltroPokemones = new ArrayList<Pokemon>();
        for (var pokemon : listPokemones) {
            if (pokemon.getTipo().equals(tipo))
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

    private static Pokemon[] ordernarPokemonesPorNivelMayorAMenor(Pokemon[] array) {
        for (var i = 0; i < array.length - 1; i++) {
            for (var j = i + 1; j < array.length; j++) {
                if (array[j].getNivel() > array[i].getNivel()) {
                    var aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        return array;
    }
}
