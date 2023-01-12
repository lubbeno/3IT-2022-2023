package sk.sosholic.prvypolrok.zoo;

import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Chovatel mojChovatel = new Chovatel("Janko");
        Animal sakal = new Animal("sakal",200);
        mojChovatel.pridatZviera(new Animal("kon",13000));
        mojChovatel.pridatZviera(sakal);
        List<Animal> mojezoo = mojChovatel.getZoo();
        mojezoo.add(new Animal("test",40));
        System.out.println("=======================================");
        System.out.println(mojezoo);
        System.out.println(mojChovatel.getZoo());
    }
}
