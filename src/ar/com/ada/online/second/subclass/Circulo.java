package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.FiguraGeometrica;

import java.util.Objects;

public class Circulo extends FiguraGeometrica {


    private double radioCirculo;

    public Circulo(double radioCirculo) {
        this.nombreFigura="Círculo";
        this.radioCirculo = radioCirculo;
    }

    @Override
    public double calcularAreaFigura() {
        this.area= PI*(radioCirculo*radioCirculo);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                ", nombreFigura='" + nombreFigura + '\'' +
                "radioCirculo=" + radioCirculo +
                ", area=" + area +
                '}';
    }
}
