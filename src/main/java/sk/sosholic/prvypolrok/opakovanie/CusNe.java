package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class CusNe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("zadaj meno a stlac enter: ");
        String meno = scanner.nextLine();
        System.out.print("zadaj priezvisko a stlac enter: ");
        String priezvisko = scanner.nextLine();
        MojeMeno mojeMeno= new MojeMeno(meno, priezvisko);

        for (int x=1 ; x<=10; x++ ){
            //System.out.println("Lubos Sukup " + x);
            if(x%2==0)
                 System.out.println(mojeMeno.getCeleMeno() + " " +x);
        }
    }
}
