package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, random);
        //final int[] listNumeros = {56, 56, 77, 78, 78, 98, 98};
        System.out.println(Arrays.toString(listNumeros));

        System.out.println("****** Crear un método que se obtenga los valores únicos. Por ejemplo: [1,1,2,2,3,4,4,3] -> [1,2,3,4] ******");
        final var arrayNumerosUnicos = quitarDuplicadosDeArray(listNumeros);
        System.out.println(Arrays.toString(arrayNumerosUnicos));
        System.out.println("Total Items filtrados:" + arrayNumerosUnicos.length);

    }

    static int[] quitarDuplicadosDeArray(int[] numeros) {
        final var n = numeros.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numeros[i] != numeros[i + 1]) {
                numeros[j++] = numeros[i];
            }
        }
        numeros[j++] = numeros[n - 1];
        final var newNumeros = new int[j];
        for (int i = 0; i < j; i++) newNumeros[i]=numeros[i];

        return newNumeros;
    }

}
