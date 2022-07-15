package ar.com.ada.online.second.superclass;

public class Feline extends Animal{
    protected String tipoGarra;


    public Feline(String name, String color, int age, String breed, String tipo,String tipoGarra) {
        super(name, color, age, breed, tipo);
        this.tipoGarra=tipoGarra;
    }
}
