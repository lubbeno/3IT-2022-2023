package sk.sosholic.prvypolrok.vynimky;

import java.io.*;

public class Priklad1 {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("nejaky beh programu");
            throw new RuntimeException("toto je nejaka chyba !!!!");
        }
        catch (Exception ex){
            System.out.println(" toto nastane ked je chyba a bezi kod v case { } ");
        }
        finally {
            System.out.println("tento kod sa vykona vzdy nezavisle o chyby");
        }
       // System.out.println("toto nikdy  nenasatne !!!!");
        System.out.println("toto je pokracovanie kodu");


    }
}
