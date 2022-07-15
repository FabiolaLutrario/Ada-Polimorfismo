package interfaces;

public class Rodado implements Comprable{

    protected int numeroRuedas;
    protected int velocidadMaxima;
    protected String color;
    protected double costo;

    public Rodado(int numeroRuedas, int velocidadMaxima, String color, double costo) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.costo = costo;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
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
        return "Rodado{" +
                "numeroRuedas=" + numeroRuedas +
                ", velocidadMaxima=" + velocidadMaxima +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                '}';
    }

    @Override
    public double definirCosto() {
        return getCosto();
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
