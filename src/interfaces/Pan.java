package interfaces;

public class Pan implements Preparable {

    public String tipo;

    public Pan(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void extraer() {
        System.out.println("Extrayendo trigo...");
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando los ingredientes para hacer pan "+tipo+"...");
    }

    @Override
    public void moldear() {
        System.out.println("Poniendo el pan en el molde...");
    }

    @Override
    public void hornear(int gradosCentigrados) {
        System.out.println("Horneando el pan a "+gradosCentigrados+" °C.");
    }
}
