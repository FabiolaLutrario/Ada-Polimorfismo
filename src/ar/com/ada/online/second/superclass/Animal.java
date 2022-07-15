package ar.com.ada.online.second.superclass;

public class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected String breed;
    protected String tipo;


    public Animal(String name, String color, int age, String breed, String tipo) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
