package sk.sosholic.prvypolrok.vynimky;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prikad2 {

    public static void main(String[] args) {
        List<String> mojList = Arrays.asList("jablko", " hruska", "slivka");
        Scanner scanner = new Scanner(System.in);
        System.out.print("zadaj index: ");
        int index = scanner.nextInt();
      /*  System.out.println(mojList.get(3));
      mojList.set(1,"ceresna");
        System.out.println(mojList);*/
        try {
            System.out.println(mojList.get(index));
        } catch (Exception ex) {
            System.out.println("mame chybu " + ex);;
            System.out.println("zadane cislo je mimo rozsah listu");;
        }
        mojList.set(1,"ceresna");
        System.out.println(mojList);
    }
}
