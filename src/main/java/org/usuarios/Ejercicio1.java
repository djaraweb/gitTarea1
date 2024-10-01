package org.usuarios;

import org.utils.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Crear un método que filtre los usuarios que tengan peso mayor de 50.00, que su nombre comience con la letra R y su apellido termine en la letra O");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var listUsuarioFiltrados = filtrarUsuarios(listUsuarios, 90., "R", "O");
        System.out.printf("La lista de usuarios con filtros es : %s", listUsuarioFiltrados);

    }

    private static List<Usuario> filtrarUsuarios(List<Usuario> listUsuarios, double pesoMayor, String startNombre, String endApellido) {
        final var usuariosFiltrados = new ArrayList<Usuario>();
        for (Usuario user : listUsuarios) {
            if (user.getPeso() > pesoMayor &&
                    user.getNombre().startsWith(startNombre) &&
                    user.getApellido().endsWith(endApellido)) {
                usuariosFiltrados.add(user);
            }
        }
        return usuariosFiltrados;
    }
}
