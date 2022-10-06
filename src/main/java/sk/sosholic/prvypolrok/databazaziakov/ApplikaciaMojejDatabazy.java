package sk.sosholic.prvypolrok.databazaziakov;

import java.util.ArrayList;
import java.util.List;

public class ApplikaciaMojejDatabazy {

    static List<Ziak> ziakList = new ArrayList<>();

    private static boolean exit = true;

    public static void main(String[] args) {
        System.out.println(" Moja databaza spoluziakov ");
        while (!exit){
            System.out.print("ak chces ukocit applikaciu stlac 0");
            System.out.print("ak chces vytovrit zaznam stlac 1");
            System.out.print("ak chces zmazat zaznam stlac 2");
            System.out.print("ak chces zobrazit zaznam stlac 3");
            System.out.print("ak chces zobrazit CELY zaznam stlac 4");
        }
    }
}
