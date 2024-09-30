package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.printf("%s%n","****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1,1000);
        System.out.printf("El array es: %s", Arrays.toString(listNumeros));

        System.out.printf("%n%s%n","****** Multiplicamos el valor de cada numero por 2 ******");
        final var arrayValoresDuplicados = duplicarValoresDeArray(listNumeros);
        System.out.printf("El array es: %s", Arrays.toString(arrayValoresDuplicados));
    }

    private static int[] duplicarValoresDeArray(int[] array) {
        for (var i = 0; i < array.length ; i++) {
            array[i] *= 2;
        }
        return array;
    }
}
