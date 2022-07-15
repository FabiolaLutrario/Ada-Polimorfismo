package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.FiguraGeometrica;

import java.util.Objects;

public class Rectangulo extends FiguraGeometrica {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.nombreFigura="Rectángulo";
        this.largo = largo;
        this.ancho=ancho;
    }

    @Override
    public double calcularAreaFigura() {
        this.area= largo*ancho;
        return area;
    }

    @Override
    public boolean tieneTodoslosLadosIguales() {
        return largo==ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", nombreFigura='" + nombreFigura + '\'' +
                ", area=" + area +
                '}';
    }
}
