package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
        //final double[] listNumeros = {56., 56.5, 55.5, 55.5, 50.544, 35.45, 98.};
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Crear un método que se obtenga los valores únicos. Por ejemplo: [1,1,2,2,3,4,4,3] -> [1,2,3,4] ******");
        final var arrayNumerosUnicos = quitarDuplicadosDeArray(listNumeros);
        System.out.println(Arrays.toString(arrayNumerosUnicos));
        System.out.println("Total Items filtrados:" + arrayNumerosUnicos.length);

    }

    static double[] quitarDuplicadosDeArray(double[] numeros) {
        final var n = numeros.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numeros[i] != numeros[i + 1]) {
                numeros[j++] = numeros[i];
            }
        }
        numeros[j++] = numeros[n - 1];
        final var newNumeros = new double[j];
        for (int i = 0; i < j; i++) newNumeros[i]=numeros[i];

        return newNumeros;
    }
}
