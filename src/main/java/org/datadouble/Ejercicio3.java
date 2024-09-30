package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 10000,100000);
        System.out.printf("El array es: %s%n", Arrays.toString(listNumeros));

        System.out.println("****** Obtenemos la suma de todos los valores del array ******");
        final var sumatoriaNumerosDeArray = obtenerSumatoriaDeNumerosDeArray(listNumeros);
        System.out.printf("Sumatoria de Numeros en Array: %.2f", sumatoriaNumerosDeArray);
    }
    private static double obtenerSumatoriaDeNumerosDeArray(double[] array) {
        var sumatoria = 0.;
        for (var numero : array) {
            sumatoria += numero;
        }
        return sumatoria;
    }
}
