package interfaces;

public class Bicicleta extends Rodado implements Comprable{

    public Bicicleta(int numeroRuedas, int velocidadMaxima, String color, double costo) {
        super(numeroRuedas, velocidadMaxima, color, costo);
    }
}
