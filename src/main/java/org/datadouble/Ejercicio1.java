package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Dividimos el valor de cada numero por 1000 ******");
        final var arrayDivisionValores = dividirValoresDeArray(listNumeros);
        System.out.println(Arrays.toString(arrayDivisionValores));
    }

    static double[] dividirValoresDeArray(double[] array) {
        for (int i = 0; i < array.length ; i++) {
            array[i] /= 1000;
        }
        return array;
    }
}
