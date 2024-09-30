package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 10000,100000);
        System.out.printf("El array es: %s%n", Arrays.toString(listNumeros));

        System.out.println("****** Ordenar numeros de Mayor a menor ******");
        final var arrayNumerosOrdenados = ordernarNumeros(listNumeros);
        System.out.printf("El array modificado es: %s", Arrays.toString(arrayNumerosOrdenados));
    }

    private static double[] ordernarNumeros(double[] array) {
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
