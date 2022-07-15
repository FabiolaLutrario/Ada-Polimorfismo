package interfaces;

public class Auto extends Rodado implements Comprable{

    private String motor;
    public Auto(String motor, int numeroRuedas, int velocidadMaxima, String color, double costo) {
        super(numeroRuedas, velocidadMaxima, color, costo);
        this.motor=motor;
    }

    public String getMotor() {
        return motor;
    }

}
