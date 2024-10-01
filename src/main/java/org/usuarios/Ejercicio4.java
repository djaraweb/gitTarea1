package org.usuarios;

import org.utils.ExcelReader;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Crear un método que filtre todos los usuarios que sean de China");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var arrayUsuarios = transformarEnArray(listUsuarios);
        ordenarArrayUsuariosPorApellido(arrayUsuarios);
        System.out.printf("La lista de usuarios con ordenada es : %s", Arrays.toString(arrayUsuarios));
    }

    private static Usuario[] transformarEnArray(List<Usuario> listaUsuarios) {
        final var totalItems=listaUsuarios.size();
        final var array = new Usuario[totalItems];
        for (var i=0; i<totalItems; i++){
            array[i] = listaUsuarios.get(i);
        }
        return array;
    }

    private static void ordenarArrayUsuariosPorApellido(Usuario[] array) {
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getApellido().compareTo(array[j + 1].getApellido()) < 0) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
