package org.streams;

import org.usuarios.Usuario;
import org.utils.ExcelReader;

import java.util.Comparator;

public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("Streams Min y Max de Usuarios por Peso (Double)");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var minUsuario = listUsuarios
                .stream()
                .min(Comparator.comparingDouble(Usuario::getPeso))
                .orElseThrow();

        final var maxUsuario = listUsuarios
                .stream()
                .max(Comparator.comparingDouble(Usuario::getPeso))
                .orElseThrow();

        System.out.printf("Usuario con peso minima: %s", minUsuario);
        System.out.printf("Usuario con peso maximo: %s", maxUsuario);
    }
}
