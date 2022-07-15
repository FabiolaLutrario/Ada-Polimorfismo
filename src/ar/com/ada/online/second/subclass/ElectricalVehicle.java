package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {

    private Integer potency;

    public ElectricalVehicle(){

    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String technicalSheet(){
        if (year <2007){
            return  "No existe modelo para este año. \n";
        } else {
            return toString()+" Es un auto de última tecnología. \n";
        }
    }

    @Override
    public int hashCode(){

        return Objects.hash(brand,model,year,potency);
    }

    @Override
    public boolean equals (Object o){
        if (this ==o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        ElectricalVehicle electricalVehicle = (ElectricalVehicle) o;
        return Objects.equals(brand, electricalVehicle.brand) &&
                Objects.equals(model, electricalVehicle.model) &&
                Objects.equals(year, electricalVehicle.year)
                &&
                Objects.equals(potency, electricalVehicle.potency);
    }

    @Override
    public String toString(){
        return "Electrical Vehicle{" +
                "brand='" + brand+ '\''+
                ", model='" + model+ '\''+
                ", year='" + year+ '\''+
                ", potency='" + potency+ '\''+
                '}';
    }
}
