package org.streams;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Streams Promedio Doubles");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 1, 1000);
        final var averageNumeros = Arrays.stream(listNumeros)
                .average()
                .orElseThrow();
        System.out.printf("El promedio es: %.8f %n", averageNumeros);
        System.out.printf("El promedio es: %.8f", promedio(listNumeros));
    }

    private static double promedio(double[] array) {
        var sumatoria = 0.;
        for (var numero : array) {
            sumatoria += numero;
        }
        return sumatoria / array.length;
    }
}
