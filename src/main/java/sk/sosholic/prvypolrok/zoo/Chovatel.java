package sk.sosholic.prvypolrok.zoo;

import java.util.ArrayList;
import java.util.List;

public class Chovatel {

    private List<Animal> zoo = new ArrayList<>();
    private String menoPriezvisko;

    public Chovatel(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }

    public void pridatZviera(Animal animal){
        zoo.add(animal);
    }

    public Animal zistiNajdrahsieZviera(){
            Animal najdrahsieZviera = zoo.get(0);
        for (Animal animalCyklus : zoo) {
           if( animalCyklus.getValue() >najdrahsieZviera.getValue()){
               najdrahsieZviera = animalCyklus;
           }
        }
        return najdrahsieZviera;
    }

    public String getMenoPriezvisko() {
        return menoPriezvisko;
    }
}
