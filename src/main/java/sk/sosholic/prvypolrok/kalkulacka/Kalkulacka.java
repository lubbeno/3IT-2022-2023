package sk.sosholic.prvypolrok.kalkulacka;

import java.util.Scanner;

public class Kalkulacka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je moj prvy program s nazvom Kalkulacka");
        System.out.println("tento program scitava dve zadane cisla");
        int exit = 1;
       while (exit!=0){
            System.out.println("Ak chces scitat slac 1 ");System.out.println("Ak chces odcitat slac 2 ");
            System.out.println("Ak chces nasobit slac 3 ");System.out.println("Ak chces delit slac 4 ");
           System.out.print("Zadana matematicka operacia: ");
            int matematickaOperacia=scanner.nextInt();
            switch (matematickaOperacia){
                case 1:
                    System.out.print("zadaj prve cislo a stlac enter: ");
                    int scitanec1 = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter: ");
                    int scitanec2 = scanner.nextInt();
                    System.out.println("vysledok scitania je: "+ (scitanec1 + scitanec2));
                    /// DOKONCIT ostatne pripady pre 2 3 4
                case 2:
                    System.out.print("zadaj prve cislo a stlac enter: ");
                    int odcitanec1 = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter: ");
                    int odcitanec2 = scanner.nextInt();
                    System.out.println("vysledok odcitania je: "+ (odcitanec1 - odcitanec2));
                case 3:
                    System.out.print("zadaj prve cislo a stlac enter: ");
                    int nasobitel1 = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter: ");
                    int nasobitel2 = scanner.nextInt();
                    System.out.println("vysledok nasobenia je: "+ (nasobitel2 * nasobitel1));

                case 4:
                    System.out.print("zadaj prve cislo a stlac enter: ");
                    int delenec = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter: ");
                    int delitel = scanner.nextInt();
                    System.out.println("vysledok delenia je: "+ (delenec / delitel));

            }
            System.out.println("ukoncenie programu stlac 0 a enter. Pre pokracovanie stlac 1");
            exit = scanner.nextInt();
        }
    }
}
