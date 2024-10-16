package org.streams;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Streams Min y Max Doubles");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 1, 1000);
        final var minNumeros = Arrays.stream(listNumeros)
                .min()
                .orElseThrow();

        final var maxNumeros = Arrays.stream(listNumeros)
                .max()
                .orElseThrow();

        System.out.printf("El minimo es: %.8f %n", minNumeros);
        System.out.printf("El maximo es: %.8f %n", maxNumeros);
    }
}
