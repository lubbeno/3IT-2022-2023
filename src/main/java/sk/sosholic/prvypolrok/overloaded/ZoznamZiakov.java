package sk.sosholic.prvypolrok.overloaded;

import java.util.Arrays;
import java.util.List;

public class ZoznamZiakov {

    List<String> zoznam = Arrays.asList("janko","petko","jurko");

    String get(){
        return zoznam.toString();
    }
    String get(int poradie){
      return   zoznam.get(poradie);
    }
}
