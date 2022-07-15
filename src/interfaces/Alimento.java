package interfaces;

import java.util.Date;

public class Alimento implements Comprable{

    private String nombre;
    private Date fechaExpiracion;
    private String color;
    private double costo;

    public Alimento(String nombre, Date fechaExpiracion, String color, double costo) {
        this.nombre = nombre;
        this.fechaExpiracion = fechaExpiracion;
        this.color = color;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String obtenerCaracteristicas() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", fechaExpiracion=" + fechaExpiracion +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                '}';
    }

    @Override
    public double definirCosto() {
        return 0;
    }

    @Override
    public double calcularPrecioFinal(double impuesto) {
        return getCosto()+(getCosto()*impuesto);
    }

    @Override
    public void comprar() {
        System.out.println("La compra se ha efectuado con éxito.");
    }
}
