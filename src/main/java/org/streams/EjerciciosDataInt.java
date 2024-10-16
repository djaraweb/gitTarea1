package org.streams;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class EjerciciosDataInt {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(10, 1, 1000);
        System.out.printf("El array es: %s %n", Arrays.toString(listNumeros));

        final var sumatoriaNumerosDeArray = Arrays
                .stream(listNumeros)
                .sum();
        System.out.printf("Sumatoria de Numeros en Array: %d %n", sumatoriaNumerosDeArray);

        final var maximoNumero = Arrays
                .stream(listNumeros)
                .max().orElse(-1);
        System.out.printf("El número mayor es: %d %n", maximoNumero);

        final var minimoNumero = Arrays
                .stream(listNumeros)
                .min().orElse(-1);
        System.out.printf("El número mínimo es: %d %n", minimoNumero);


        final var newArray = Arrays.stream(listNumeros)
                .map(x -> x * 2)
                .toArray();
        System.out.printf("El array con el doble de cada elemento es: %s %n", Arrays.toString(newArray));

        final var arrayValoresUnicos = Arrays.stream(listNumeros)
                .boxed()
                .collect(Collectors.toSet());
        System.out.printf("El array con valores unicos es : %s %n", arrayValoresUnicos);


        final var arrayNumerosOrdenadosAsc = Arrays.stream(listNumeros)
                .sorted()
                .toArray();
        System.out.printf("El array Ordenado (ASC) es: %s %n", Arrays.toString(arrayNumerosOrdenadosAsc));

        final var arrayNumerosOrdenadosDesc = Arrays.stream(listNumeros)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray();

        System.out.printf("El array Ordenado (DESC) es: %s", Arrays.toString(arrayNumerosOrdenadosDesc));
    }

}
