package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.printf("%s%n","****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1,1000);
       // final int[] listNumeros = {50, 100, 200, 550};
        System.out.printf(Arrays.toString(listNumeros));

        System.out.printf("%n%s%n","****** Que calcule la suma de todos los valores ******");
        final var sumatoriaNumerosDeArray = obtenerSumatoriaDeNumerosDeArray(listNumeros);
        System.out.printf("Sumatoria de Numeros en Array: %d" ,sumatoriaNumerosDeArray);
    }

    static int obtenerSumatoriaDeNumerosDeArray(int[] array) {
        var sumatoria = 0;
        for (int i = 0; i < array.length ; i++) {
            sumatoria += array[i];
        }
        return sumatoria;
    }
}
