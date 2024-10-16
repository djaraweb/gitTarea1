package org.streams;

import org.usuarios.Usuario;
import org.utils.ExcelReader;

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Streams toArray");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var arrayUsuarios = listUsuarios
                .stream()
                .toArray();

        ordenarArray(arrayUsuarios);
        System.out.println(Arrays.toString(arrayUsuarios));
    }

    private static void ordenarArray(Object[] array) {
        for (var i = 0; i < array.length - 1; i++) {
            for (var j = i + 1; j < array.length; j++) {
                if (((Usuario) array[j]).getEdad() < ((Usuario) array[i]).getEdad()) {
                    var aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }

}
