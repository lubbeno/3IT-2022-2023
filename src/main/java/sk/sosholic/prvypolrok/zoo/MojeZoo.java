package sk.sosholic.prvypolrok.zoo;

import java.util.Scanner;

public class MojeZoo {
    public static void main(String[] args) {
        String menoZoo;
        Chovatel mojChovatel;
        Scanner scanner = new Scanner(System.in);

        System.out.println("toto je moje Zoo");
        System.out.print("Zadaj meno Zoo: ");
        menoZoo = scanner.nextLine();
        System.out.print("Zadaj meno chovatela: ");
        mojChovatel = new Chovatel(scanner.nextLine());
        Animal sakal = new Animal("sakal",200);
        mojChovatel.pridatZviera(new Animal("kon",13000));
        mojChovatel.pridatZviera(sakal);

        while (true){
            System.out.println("=========================================");
            System.out.println("Menu Zoo");
            System.out.println(" 1. zobraz meno Zoo");
            System.out.println(" 2. zobraz meno Chovatela");
            System.out.println(" 3. pridat zviera: ");
            System.out.println(" 4. vypis zoznam zvierat: ");
            System.out.println(" 5. zobraz najdrahsie zviera: ");
            System.out.println(" 6. exit");
            System.out.println("========================================== \n");
            System.out.print("Zadaj cislo menu: ");
            int cisloMenu = scanner.nextInt();
            switch (cisloMenu){
                case 1:
                    System.out.println("Meno zoo je "+ menoZoo);
                    break;
                case 2:
                    System.out.println("Meno Chovatela je " +mojChovatel.getMenoPriezvisko());
                    break;
                case 3:
                    System.out.print("zadaj meno zvierata: ");
                    String meno = scanner.nextLine();
                    System.out.print("zadaj cenu: ");
                    double cena = scanner.nextDouble();
                    mojChovatel.pridatZviera(new Animal(meno,cena));
                    break;
                case 4:
                    System.out.println("zoznam zvieratiek v Zoo: ");
                    System.out.println(mojChovatel.getZoo());
                    break;
                case 5:
                    System.out.print(":najdrahsie zviera je: " +
                            mojChovatel.zistiNajdrahsieZviera().getAnimalType());
                case 6:
                    System.exit(0);
            }

        }

    }


}
