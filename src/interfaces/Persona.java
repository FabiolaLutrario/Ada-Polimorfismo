package interfaces;

public class Persona implements LivingBeing{

    public String name;
    public String phoneNumber;
    public String emailAddress;

    public void sayHello(String nameToSayHello){
        System.out.println("Hello "+nameToSayHello);
    }


    @Override
    public void eat(String foodName) {
        System.out.println("Hola, soy una persona y estoy comiendo "+foodName);
    }

    @Override
    public void sleep() {
        System.out.println("Hola, soy una persona y estoy durmiendo.");

    }

    @Override
    public void communicate() {
        System.out.println("Hola, soy una persona y estoy comunicándome.");

    }
}
