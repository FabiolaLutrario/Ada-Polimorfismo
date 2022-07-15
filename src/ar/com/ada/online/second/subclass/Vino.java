package ar.com.ada.online.second.subclass;

import java.util.Date;

public class Vino extends ArticuloCanastaNoBasica{

    private int aniejamiento;


    public Vino(String identificador, String nombre, double costo, Date fechaVencimiento, int aniejamiento) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.aniejamiento=aniejamiento;
    }

    @Override
    public double obtenerPrecio() {
        double precioFinal= super.obtenerPrecio();
        int multiplicador =calcularmultiplicador();

        return precioFinal+(precioFinal*(multiplicador/10.0));
    }
    private int calcularmultiplicador(){
        return aniejamiento/5;
    }
}
