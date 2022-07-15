package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {

    private Integer rpm;

    public SportsVehicle(){

    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet(){
        String atributos= toString();
            if(rpm>=0 && rpm<=50){
                return atributos+ ". El auto es muy bonito, pero solo sirve para salir a pasear. \n";
            }else if(rpm>=51 && rpm<=300){
                return atributos+ ". Con este auto puedes desafiar a cualquiera en la pista. \n";
            }else if(rpm>=301 && rpm<=600){
                return atributos+ ". Si tienes este auto, debe considerar participar en NASCAR. \n";
            }else{
                return atributos+ ". ¿Eres parte del elenco de rápidos y furiosos? \n";
            }
    }

    @Override
    public int hashCode(){

        return Objects.hash(brand,model,year,rpm);
    }

    @Override
    public boolean equals (Object o){
        if (this ==o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        SportsVehicle sportsVehicle = (SportsVehicle) o;
        return Objects.equals(brand, sportsVehicle.brand) &&
                Objects.equals(model, sportsVehicle.model) &&
                Objects.equals(year, sportsVehicle.year)
                &&
                Objects.equals(rpm, sportsVehicle.rpm);
    }

    @Override
    public String toString(){
        return "Sports Vehicle{" +
                "brand='" + brand+ '\''+
                ", model='" + model+ '\''+
                ", year='" + year+ '\''+
                ", rpm='" + rpm+ '\''+
                '}';
    }
}
