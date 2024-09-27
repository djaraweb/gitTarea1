package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
       // final int[] listNumeros = {50, 100, 200, 550};
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Que calcule la suma de todos los valores ******");
        final var sumatoriaNumerosDeArray = obtenerSumatoriaDeNumerosDeArray(listNumeros);
        System.out.println("Sumatoria de Numeros en Array: " + sumatoriaNumerosDeArray);

    }

    static int obtenerSumatoriaDeNumerosDeArray(int[] array) {
        var sumatoria = 0;
        for (int i = 0; i < array.length ; i++) {
            sumatoria += array[i];
        }
        return sumatoria;
    }
}
