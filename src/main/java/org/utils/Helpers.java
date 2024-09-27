package org.utils;

import java.util.Random;

public class Helpers {

    public static double generateRandomDouble(double max, double min, Random random) {
        return (max - min) * random.nextDouble() + min;
    }

    public static double[] generateArrayNumeros(int totalNumeros, Random random) {
        final var numeros = new double[totalNumeros];
        for (var i = 0; i < totalNumeros; i++) {
            numeros[i] = generateRandomDouble(100000, 10000, random);
        }
        return numeros;
    }
}

