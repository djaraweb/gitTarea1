package org.usuarios;

import org.utils.ExcelReader;

import java.util.HashMap;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Crear un método que sume las edades de 2 usuarios en base a su ID");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var mapUsuarios = convertirHashMap(listUsuarios);
        final var userID1 = mapUsuarios.get("USR-3");
        final var userID2 = mapUsuarios.get("USR-4");
        final var sumaEdades = userID1.getEdad() + userID2.getEdad();

        System.out.printf("Usuario1 : %s%n Usuario2 : %s", userID1, userID2);
        System.out.printf("La Suma de edades de los usuarios es : %d", sumaEdades);
    }

    private static HashMap<String, Usuario> convertirHashMap(List<Usuario> listaUsuarios) {
        final var mapUsers = new HashMap<String, Usuario>();
        for (Usuario user : listaUsuarios) {
            mapUsers.put(user.getId(), user);
        }
        return mapUsers;
    }
}
