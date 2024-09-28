package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.printf("%s%n", "****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        System.out.printf("El array es: %s", Arrays.toString(listNumeros));

        System.out.printf("%n%s%n", "****** Ordenar numeros de Menor a mayor ******");
        final var arrayNumerosOrdenados = ordernarNumeros(listNumeros);
        System.out.printf("El array es: %s", Arrays.toString(arrayNumerosOrdenados));
    }

    private static int[] ordernarNumeros(int[] array) {
        for (var i = 0; i < array.length - 1; i++) {
            for (var j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    var aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        return array;
    }
}
