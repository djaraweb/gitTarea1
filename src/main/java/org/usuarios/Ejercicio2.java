package org.usuarios;

import org.utils.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Crear un método que filtre todos los usuarios que en su correo el dominio de gmail.com");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var listUsuarioFiltrados = filtrarUsuarios(listUsuarios, "gmail.com");
        System.out.printf("La lista de usuarios con filtros es : %s", listUsuarioFiltrados);

    }

    private static List<Usuario> filtrarUsuarios(List<Usuario> listUsuarios, String endEmail) {
        final var usuariosFiltrados = new ArrayList<Usuario>();
        for (Usuario user : listUsuarios) {
            if (user.getCorreo().endsWith(endEmail.toUpperCase())) {
                usuariosFiltrados.add(user);
            }
        }
        return usuariosFiltrados;
    }
}
