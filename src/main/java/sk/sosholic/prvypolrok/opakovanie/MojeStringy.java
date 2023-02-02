package sk.sosholic.prvypolrok.opakovanie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MojeStringy {

    public static void main(String[] args) throws IOException {

       Osoba osoba1 = new Osoba("Lubos","Sukup");
        System.out.println("Moje meno je "+ osoba1.getMeno());
        System.out.println("moje meno s velkymi pismenami je "+ osoba1.velkePismenna());
        //System.out.println("moje meno s malymi pismenami je " + menopriezvisko);
        System.out.println("pocet slov v mene je " + osoba1.getPocetZnakov());

        FileWriter fw = new FileWriter("osoba1.txt");
                    fw.write("Moje meno je "+ osoba1.getMeno() +"\""+
                            "\n"+"moje meno s velkymi pismenami je "+ osoba1.velkePismenna()+
                            "\n"+ "pocet slov v mene je " + osoba1.getPocetZnakov());
                    fw.close();



        FileWriter fw1 = new FileWriter("osoba2.txt",true);
        fw1.write("Moje meno je "+ osoba1.getMeno() +"\n" );
        fw1.write("moje meno s velkymi pismenami je "+ osoba1.velkePismenna() +"\n");
        fw1.write( "pocet slov v mene je " + osoba1.getPocetZnakov()+"\n");
        fw1.close();
    }
}
