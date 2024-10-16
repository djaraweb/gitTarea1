package org.streams;

import org.utils.Helpers;

import java.util.Arrays;

public class EjercicioDataDouble {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de doubles aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(10, 1, 1000);
        System.out.printf("El array es: %s %n", Arrays.toString(listNumeros));

        final var promedioNumerosDeArray = Arrays
                .stream(listNumeros)
                .average()
                .orElse(-1);
        System.out.printf("El promedio simple es: %.2f %n", promedioNumerosDeArray);

        final var minimoNumerosDeArray = Arrays
                .stream(listNumeros)
                .min()
                .orElse(-1);
        System.out.printf("El promedio simple es: %.2f %n", minimoNumerosDeArray);

    }
}
