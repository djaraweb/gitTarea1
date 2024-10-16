package org.streams;

import org.usuarios.Usuario;
import org.utils.ExcelReader;

import java.util.Comparator;

public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Streams Min y Max de Usuarios por Edad");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var minUsuario = listUsuarios
                .stream()
                .min(Comparator.comparingInt(Usuario::getEdad))
                .orElseThrow();

        final var maxUsuario = listUsuarios
                .stream()
                .max(Comparator.comparingInt(Usuario::getEdad))
                .orElseThrow();

        System.out.printf("Usuario con edad minima: %s", minUsuario);
        System.out.printf("Usuario con edad maxima: %s", maxUsuario);
    }
}
