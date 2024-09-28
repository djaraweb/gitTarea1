package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.printf("%s%n","****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1,1000);
        //final int[] listNumeros = {56, 56, 77, 78, 78, 98, 98};
        System.out.printf(Arrays.toString(listNumeros));

        System.out.printf("%n%s%n","****** Crear un método que se obtenga los valores únicos. Por ejemplo: [1,1,2,2,3,4,4,3] -> [1,2,3,4] ******");
        final var arrayNumerosUnicos = quitarDuplicadosDeArray(listNumeros);
        System.out.printf(Arrays.toString(arrayNumerosUnicos.toArray()));
        System.out.printf("%nTotal Items filtrados: %d", arrayNumerosUnicos.size());

    }

    private static Set<Integer> quitarDuplicadosDeArray(int[] numeros) {
        Set<Integer> listNumeros = new HashSet<>();
        final var n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            listNumeros.add(numeros[i]);
        }
        return listNumeros;
    }

}
