package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.PromedioSalario;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    Connection conexion;

    public Requerimiento_3Dao() {
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<PromedioSalario> requerimiento3() throws SQLException {
        ArrayList<PromedioSalario> lista = new ArrayList<>();
        String sql = "select Cargo, avg(Salario) as Salario from Lider lider group by Cargo HAVING avg(Salario) > 500000";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while (resultados.next()) {
            PromedioSalario promedioSalario = new PromedioSalario();
            promedioSalario.setCargo(resultados.getString("Cargo"));
            promedioSalario.setSalarioPromedio(resultados.getDouble("Salario"));
            lista.add(promedioSalario);
        }

        conexion.close();

        return lista;

    }
}