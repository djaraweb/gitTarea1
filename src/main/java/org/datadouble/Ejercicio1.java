package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(50, 10000,100000);
        System.out.printf("El array es: %s%n", Arrays.toString(listNumeros));

        System.out.println("****** Dividimos el valor de cada numero por 1000 ******");
        final var arrayDivisionValores = dividirValoresDeArray(listNumeros);
        System.out.printf("El array modificado es: %s", Arrays.toString(arrayDivisionValores));
    }

    private static double[] dividirValoresDeArray(double[] array) {
        for (var i = 0; i < array.length ; i++) {
            array[i] /= 1000;
        }
        return array;
    }
}
