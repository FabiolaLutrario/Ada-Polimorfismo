package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck(){

    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String technicalSheet(){
        String atributos = toString();
        if(maxLoad<100){
            return atributos+ ". Para iniciar un negocio de flete, está muy bien este auto. \n";
        }else{
            return atributos+ ". Tienes que usar este auto en el campo, es una máquina de trabajo!! \n";
        }
    }

    @Override
    public int hashCode(){

        return Objects.hash(brand,model,year,maxLoad);
    }

    @Override
    public boolean equals (Object o){
        if (this ==o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Truck truck = (Truck) o;
        return Objects.equals(brand, truck.brand) &&
                Objects.equals(model, truck.model) &&
                Objects.equals(year, truck.year)
                &&
                Objects.equals(maxLoad, truck.maxLoad);
    }

    @Override
    public String toString(){
        return "Truck Vehicle{" +
                "brand='" + brand+ '\''+
                ", model='" + model+ '\''+
                ", year='" + year+ '\''+
                ", maxLoad='" + maxLoad+ '\''+
                '}';
    }
}
