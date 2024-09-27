package org.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Helpers {

    public static int generateRandomInt(int max, int min, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double generateRandomDouble(double max, double min, Random random) {
        return (max - min) * random.nextDouble() + min;
    }

    public static List<Integer> generateListNumeros(int totalNumeros) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<>();
        for (var i = 1; i < totalNumeros; i++) {
            numeros.add(generateRandomInt(1000, 1, random));
        }
        return numeros;
    }

    public static int[] generateArrayNumeros(int totalNumeros, Random random) {
        final var numeros = new int[totalNumeros];
        for (var i = 0; i < totalNumeros; i++) {
            numeros[i] = generateRandomInt(1000, 1, random);
        }
        return numeros;
    }
}
