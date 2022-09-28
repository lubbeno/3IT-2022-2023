package sk.sosholic.prvypolrok.hadaniecisla;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HadameCislo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je hra na hladanie cisla ");
        System.out.print("Zadaj rozsah : 1 az ");
/*        int high = scanner.nextInt();
        Random r = new Random();
        int low = 1;
        int cisloKtoreTrebaUhadnut = r.nextInt(high - low) + low;*/
        int cisloKtoreTrebaUhadnut = nahodneCislo(scanner.nextInt());
        System.out.print("Zadaj počet pokusov: ");
         int pocetpokusov = scanner.nextInt();
         int pokusCislo = 0;
        while (pokusCislo<pocetpokusov){
            pokusCislo++;
            System.out.print("zadaj cislo: ");
            int cislo = scanner.nextInt();
            System.out.println("zadane cislo je: " + cislo);
            if(cislo > cisloKtoreTrebaUhadnut){
                System.out.println("cislo "+  cislo +" je vascie ");
            }else if(cislo < cisloKtoreTrebaUhadnut){
                System.out.println("cislo "+  cislo +" je menise");
            }else {
                System.out.println("uhadol si cislo " + cisloKtoreTrebaUhadnut);
                break;
            }
        }
        System.out.println("cislo bolo " + cisloKtoreTrebaUhadnut);
    }

    private static int nahodneCislo( int high){
        Random r = new Random();
        int low = 1;
        return r.nextInt(high - low) + low;
    }
}
