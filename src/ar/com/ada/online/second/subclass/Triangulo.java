package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.FiguraGeometrica;

import java.util.Objects;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;

    public Triangulo(double base, double altura, double ladoA, double ladoB) {
        this.nombreFigura="Triángulo";
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularAreaFigura() {
        this.area= (base*altura)/2;
        return area;
    }

    @Override
    public boolean tieneTodoslosLadosIguales() {
        return base == ladoA && base == ladoB;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", nombreFigura='" + nombreFigura + '\'' +
                ", area=" + area +
                '}';
    }
}
