package sk.sosholic.prvypolrok.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<Animal> getZoo(){
        List<Animal> copyOfZoo = zoo.stream().collect(Collectors.toList());
        return copyOfZoo;
    }
}
