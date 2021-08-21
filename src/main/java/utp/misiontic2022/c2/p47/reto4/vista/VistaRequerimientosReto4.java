package utp.misiontic2022.c2.p47.reto4.vista;

import java.text.DecimalFormat;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.PromedioSalario;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static ArrayList<Lider> requerimiento1() {
        ArrayList<Lider> resultado = new ArrayList<>();
        try {
            resultado = controlador.consultarRequerimiento1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static ArrayList<String> requerimiento2() {
        ArrayList<String> resultado = new ArrayList<>();
        try {
            resultado = controlador.consultarRequerimiento2();
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

    public static ArrayList<PromedioSalario> requerimiento3() {
        ArrayList<PromedioSalario> resultado = new ArrayList<>();
        try {
            resultado = controlador.consultarRequerimiento3();
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

}
