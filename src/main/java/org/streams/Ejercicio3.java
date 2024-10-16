package org.streams;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Streams Sumar Valores");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        final var sumNumeros = Arrays.stream(listNumeros)
                .sum();
        System.out.printf("La suma es: %s", sumNumeros);
    }
}
