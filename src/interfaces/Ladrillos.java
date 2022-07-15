package interfaces;

public class Ladrillos implements Preparable {

    public String tipo;

    public Ladrillos(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void extraer() {
        System.out.println("Extrayendo arcilla...");
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando los materiales para hacer ladrillo "+tipo+"...");
    }

    @Override
    public void moldear() {
        System.out.println("Moldeando los ladrillos...");
    }

    @Override
    public void hornear(int gradosCentigrados) {
        System.out.println("Horneando los ladrillos a "+gradosCentigrados+" °C.");
    }
}
