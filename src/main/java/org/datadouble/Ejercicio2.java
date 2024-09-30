package org.datadouble;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 10000,100000);
        System.out.printf("El array es: %s%n", Arrays.toString(listNumeros));

        System.out.println("****** Crear un método que se obtenga los valores únicos. Por ejemplo: [1,1,2,2,3,4,4,3] -> [1,2,3,4] ******");
        final var arrayNumerosUnicos = quitarDuplicadosDeArray(listNumeros);
        System.out.printf("El array modificado es: %s%n", Arrays.toString(arrayNumerosUnicos.toArray()));

        System.out.printf("Total Items filtrados: %d" , arrayNumerosUnicos.size());
    }

    private static Set<Double> quitarDuplicadosDeArray(double[] numeros) {
        final var listNumeros = new HashSet<Double>();
        for (var numero: numeros){
            listNumeros.add(numero);
        }
        return listNumeros;
    }
}
