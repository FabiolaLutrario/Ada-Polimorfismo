import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static final void main(String[] args) {

        List<Comprable> compra=new ArrayList<>();
        compra.add(new Auto("100L",4,220,"Blanco",600000));

/*
        List<Preparable> preparaciones=new ArrayList<>();
        preparaciones.add(new Pan("de Sandwinch"));
        preparaciones.add(new Ladrillos("Refractario"));

        for(int i=0; i<preparaciones.size();i++){
            preparaciones.get(i).extraer();
            preparaciones.get(i).mezclar();
            preparaciones.get(i).moldear();
            preparaciones.get(i).hornear(130);
            System.out.println("");
        }*/

/*        List<LivingBeing> livingBeings=new ArrayList<>();
        livingBeings.add(new Persona());
        livingBeings.add(new Animal());

        for(int i=0; i<livingBeings.size();i++){
            livingBeings.get(i).eat("Carne");
            livingBeings.get(i).sleep();
            livingBeings.get(i).communicate();
        }*/

/*        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Arroz ("00123","Doña Pepa",
                100, new Date(),"Integral"));
        articulos.add(new Leche("001234", "Buenísima",
                5000, new Date(),false));
        articulos.add(new Vino ("00125", "Santa Julia",
                10000, new Date(), 15));

        for (int i=0; i<articulos.size();i++){
            System.out.println("Artículo: "+articulos.get(i).getNombre()+
                    ". Precio final: "+articulos.get(i).obtenerPrecio());

        }*/

/*        List<FiguraGeometrica> figurasGeometricas =new ArrayList<>();
        figurasGeometricas.add(new Circulo(20));
        figurasGeometricas.add(new Rectangulo(24.5,20.6));
        figurasGeometricas.add(new Triangulo(10,20,25,25));

        for(int i =0; i<figurasGeometricas.size(); i++){
            figurasGeometricas.get(i).calcularAreaFigura();
            System.out.println(figurasGeometricas.get(i).toString());

        }*/

        /*Vehicle[] arrayVehicles = new Vehicle[12];
        arrayVehicles[0] = new Vehicle("Chevrolet", "4x4", 1997);
        arrayVehicles[1] = new Vehicle("Yamaha", "125", 1995);
        arrayVehicles[2] = new Vehicle("Kawasaki", "Mountain bike", 2019);
        arrayVehicles[3] = new ElectricalVehicle("Nissan", "LEAF", 2005, 147);
        arrayVehicles[4] = new ElectricalVehicle("Tesla", "3", 2020, 379);
        arrayVehicles[5] = new ElectricalVehicle("Audi", "E-Tron", 2022, 313);
        arrayVehicles[6] = new SportsVehicle("Ferrari", "Daytona", 2022, 9250);
        arrayVehicles[7] = new SportsVehicle("Chevrolet", "Camaro", 2018, 461);
        arrayVehicles[8] = new SportsVehicle("Tesla", "Roadster", 2022, 1500);
        arrayVehicles[9] = new Truck("Carterpillar", "Diecast Masters 85501 C", 1999, 40);
        arrayVehicles[10] = new Truck("Mercedes-Benz", "Actros F", 2021, 120);
        arrayVehicles[11] = new Truck("Volvo", "FH", 2021, 100);

        for(int i=0; i<arrayVehicles.length;i++){
            System.out.println(arrayVehicles[i].technicalSheet());
        }
    }*/
    }
}

