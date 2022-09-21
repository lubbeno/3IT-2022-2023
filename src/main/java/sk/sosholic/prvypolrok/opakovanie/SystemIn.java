package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class SystemIn {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("zadaj volaco a stlac enter: ");
        String ulozenyRiadok = scanner.nextLine();
        System.out.println(ulozenyRiadok);

    }

}
