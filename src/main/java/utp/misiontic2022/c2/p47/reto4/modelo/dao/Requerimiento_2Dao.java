package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    Connection conexion;

    public Requerimiento_2Dao() {
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> requerimiento2() throws SQLException {
        ArrayList<String> nombresLider = new ArrayList<>();
        String sql = "Select LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) as NOMBRES_LIDER from Lider l";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while (resultados.next()) {
            nombresLider.add(resultados.getString("NOMBRES_LIDER"));
        }

        conexion.close();

        return nombresLider;
    }
}