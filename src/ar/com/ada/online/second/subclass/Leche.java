package ar.com.ada.online.second.subclass;

import java.util.Date;

public class Leche extends ArticuloCanastaBasica{

    private boolean entera;

    public Leche(String identificador, String nombre, double costo, Date fechaVencimiento, boolean entera) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.entera=entera;
    }

    @Override
    public double obtenerPrecio() {
        double precioFinal= super.obtenerPrecio();
        if (!entera){
            precioFinal=precioFinal*1.05;
        }
        return precioFinal;
    }
}
