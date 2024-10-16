package org.streams;

import org.utils.Helpers;

import java.util.Comparator;

public class EjercicioList {
    public static void main(String[] args) {
        System.out.println("****** Generamos una List<Integers> aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateListInteger(10, 1, 1000);
        System.out.printf("El array inicial es: %s %n", listNumeros);

        final var sumaLista = listNumeros
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.printf("El promedio simple es: %d %n", sumaLista);

        final var minLista = listNumeros
                .stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(-1);
        System.out.printf("El promedio simple es: %d %n", minLista);

        final var ordenarListaAsc = listNumeros
                .stream()
                .sorted(Comparator.comparingInt(Integer::intValue))
                .toList();
        System.out.printf("El array ordenado (Asc) es: %s %n", ordenarListaAsc);

        final var ordenarListaDesc = listNumeros
                .stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .toList();
        System.out.printf("El array ordenado (Desc) es: %s %n", ordenarListaDesc);

    }
}
