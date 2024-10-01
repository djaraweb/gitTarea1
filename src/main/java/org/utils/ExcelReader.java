package org.utils;

import com.poiji.bind.Poiji;
import org.usuarios.Usuario;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private static final String excelpath = "src/main/resources/dataExcel/data.xlsx";

    public static List<Usuario> getListUsuarios() {
        return Poiji.fromExcel(new File(excelpath), Usuario.class);
    }
}
