package org.usuarios;

import org.utils.ExcelReader;

import java.util.HashMap;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Crear un método que sume las edades de 2 usuarios en base a su ID");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var mapUsuarios = convertirHashMap(listUsuarios);
        final var user1 = mapUsuarios.get("USR-3");
        final var user2 = mapUsuarios.get("USR-4");
        final var sumaEdades = user1.getEdad() + user2.getEdad();

        System.out.printf("Usuario1 : %s%n Usuario2 : %s", user1, user2);
        System.out.printf("La Suma de edades de los usuarios es : %d", sumaEdades);
    }

    private static HashMap<String, Usuario> convertirHashMap(List<Usuario> listaUsuarios) {
        final var mapUsers = new HashMap<String, Usuario>();
        for (var user : listaUsuarios) {
            mapUsers.put(user.getId(), user);
        }
        return mapUsers;
    }
}
