package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Multiplicamos el valor de cada numero por 2 ******");
        final var arrayValoresDuplicados = duplicarValoresDeArray(listNumeros);
        System.out.println(Arrays.toString(arrayValoresDuplicados));
    }

    static int[] duplicarValoresDeArray(int[] array) {

        for (int i = 0; i < array.length ; i++) {
            array[i] *= 2;
        }
        return array;
    }

}
