package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.LiderDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.PromedioSalario;

public class ControladorRequerimientos {

    LiderDao liderDao = new LiderDao();
    Requerimiento_2Dao requerimiento_2Dao = new Requerimiento_2Dao();
    Requerimiento_3Dao requerimiento_3Dao = new Requerimiento_3Dao();

    public ArrayList<Lider> consultarRequerimiento1() throws SQLException {
        return liderDao.requerimiento1();
    }

    public ArrayList<String> consultarRequerimiento2() throws SQLException {
        return requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<PromedioSalario> consultarRequerimiento3() throws SQLException {
        return requerimiento_3Dao.requerimiento3();
    }

}
