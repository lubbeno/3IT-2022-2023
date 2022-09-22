package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class SystemIn {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int exit = 1;
        while (exit!=0){
            //Toto je moj prvy program s nazvom Kalkulacka
            //tento program scitava dve zadane cisla
            //zadaj prve cislo a stlac enter:
            //zadaj druhe cislo a stlac enter:
            // vysledok scitania je:

            System.out.println("ukoncenie programu stlac 0 a enter. Pre pokracovanie stlac 1");
            exit = scanner.nextInt();
        }

    }

}
