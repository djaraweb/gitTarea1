package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Ordenar numeros de Mayor a menor ******");
        final var arrayNumerosOrdenados = ordernarNumeros(listNumeros);
        System.out.println(Arrays.toString(arrayNumerosOrdenados));

    }

    static double[] ordernarNumeros(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    double aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        return array;
    }
}
