package sk.sosholic.prvypolrok.kalkulacka;


import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       int exit = 1;

       while (exit!=0){
           int out= scanner.nextInt();
           System.out.println("========" +out);

           System.out.println("ukoncenie programu stlac 0 a enter");
           exit = scanner.nextInt();
       }


    }
}
