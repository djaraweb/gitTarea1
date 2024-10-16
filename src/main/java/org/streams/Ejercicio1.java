package org.streams;

import org.usuarios.Usuario;
import org.utils.ExcelReader;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Streams Collectors.toMap");
        final var listUsuarios = ExcelReader.getListUsuarios();
        
        final var mapUsuarios = listUsuarios
                .stream()
                .collect(Collectors.toMap(Usuario::getId, Function.identity()));

        final var user1 = mapUsuarios.get("USR-26");
        final var user2 = mapUsuarios.get("USR-20");

        System.out.println(user1);
        System.out.println(user2);
    }

}
