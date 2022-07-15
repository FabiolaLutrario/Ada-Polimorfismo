package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Articulo;

import java.util.Date;

public class ArticuloCanastaBasica extends Articulo {


    public ArticuloCanastaBasica(String identificador, String nombre, double costo, Date fechaVencimiento) {
        super(identificador, nombre, costo, fechaVencimiento, true);
    }

    @Override
    public double obtenerPrecio() {

        return costo+(costo*GANANCIA);
    }
}
