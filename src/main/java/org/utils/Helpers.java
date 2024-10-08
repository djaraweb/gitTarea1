package org.utils;

import com.github.javafaker.Faker;

public class Helpers {

    public static int[] generateArrayNumeros(int totalNumeros, int min, int max) {
        final var numeros = new int[totalNumeros];
        final var faker = new Faker();
        for (var i = 0; i < totalNumeros; i++) {
            numeros[i] = faker.number().numberBetween(min,max);
        }
        return numeros;
    }

    public static double[] generateArrayNumerosDecimales(int totalNumeros, int min, int max) {
        final var numeros = new double[totalNumeros];
        final var faker = new Faker();
        for (var i = 0; i < totalNumeros; i++) {
            numeros[i] = faker.number().randomDouble(2,min,max);
        }
        return numeros;
    }
}
