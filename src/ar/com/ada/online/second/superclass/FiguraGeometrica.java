package ar.com.ada.online.second.superclass;

public abstract class FiguraGeometrica {

    public static final double PI=3.1416;
    protected String nombreFigura;
    protected double area;

    public abstract double calcularAreaFigura();

    public boolean tieneTodoslosLadosIguales(){
        return false;
    }
}
