package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class CusNe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("zadaj meno a stlac enter: ");
        String meno = scanner.nextLine();

        // dopln zbytok tak aby program vyzadoval zadanie mena a priezviska
        // do konzoly.

        MojeMeno mojeMeno= new MojeMeno(meno, "Sukup");

        for (int x=1 ; x<=10; x++ ){
            //System.out.println("Lubos Sukup " + x);
            if(x%2==0)
                 System.out.println(mojeMeno.getCeleMeno() + " " +x);

        }

    }
}
