package org.streams;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Streams Min y Max Integers");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        final var minNumeros = Arrays.stream(listNumeros)
                .min()
                .orElseThrow();

        final var maxNumeros = Arrays.stream(listNumeros)
                .max()
                .orElseThrow();

        System.out.printf("El valor minimo es: %d%n", minNumeros);
        System.out.printf("El valor maximo es: %d", maxNumeros);
    }
}
