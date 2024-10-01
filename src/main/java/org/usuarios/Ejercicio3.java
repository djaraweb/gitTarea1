package org.usuarios;

import org.utils.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Crear un método que filtre todos los usuarios que sean de China");
        final var listUsuarios = ExcelReader.getListUsuarios();
        final var listUsuarioFiltrados = filtrarUsuarios(listUsuarios, "China");
        System.out.printf("La lista de usuarios con filtros es : %s", listUsuarioFiltrados);
    }

    private static List<Usuario> filtrarUsuarios(List<Usuario> listUsuarios, String pais) {
        final var usuariosFiltrados = new ArrayList<Usuario>();
        for (Usuario user : listUsuarios) {
            if (user.getPais().equals(pais.toUpperCase())) {
                usuariosFiltrados.add(user);
            }
        }
        return usuariosFiltrados;
    }
}
