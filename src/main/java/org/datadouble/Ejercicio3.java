package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
        //final double[] listNumeros = {56., 56.5, 55.5, 55.5, 50.544, 35.45, 98.};
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Que calcule la suma de todos los valores ******");
        final var sumatoriaNumerosDeArray = obtenerSumatoriaDeNumerosDeArray(listNumeros);
        System.out.println("Sumatoria de Numeros en Array: " + sumatoriaNumerosDeArray);

    }

    static double obtenerSumatoriaDeNumerosDeArray(double[] array) {
        var sumatoria = 0.;
        for (int i = 0; i < array.length ; i++) {
            sumatoria += array[i];
        }
        return sumatoria;
    }
}
