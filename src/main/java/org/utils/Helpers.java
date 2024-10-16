package org.utils;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Helpers {
    final static Faker faker = new Faker();

    public static int[] generateArrayNumeros(int totalNumeros, int min, int max) {
        final var numeros = new int[totalNumeros];
        for (var i = 0; i < totalNumeros; i++) {
            numeros[i] = faker.number().numberBetween(min, max);
        }
        return numeros;
    }

    public static double[] generateArrayNumerosDecimales(int totalNumeros, int min, int max) {
        final var numeros = new double[totalNumeros];
        for (var i = 0; i < totalNumeros; i++) {
            numeros[i] = faker.number().randomDouble(2, min, max);
        }
        return numeros;
    }

    public static List<Integer> generateListInteger(int totalNumeros, int min, int max) {
        final var lista = new ArrayList<Integer>();
        for (var i = 0; i < totalNumeros; i++) {
            lista.add(faker.number().numberBetween(min, max));
        }
        return lista;
    }

    public static List<Double> generateListDouble(int totalNumeros, int min, int max) {
        final var lista = new ArrayList<Double>();
        for (var i = 0; i < totalNumeros; i++) {
            lista.add(faker.number().randomDouble(2, min, max));
        }
        return lista;
    }
}
