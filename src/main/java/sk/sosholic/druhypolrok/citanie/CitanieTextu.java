package sk.sosholic.druhypolrok.citanie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CitanieTextu {

    public static void main(String[] args) {
        //myFileReader("a.txt");
        myBufferedFileReader("a.txt");
    }

    private static void myBufferedFileReader(String cestaKSubouru) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(cestaKSubouru));
           String riadok ="";
           while (riadok != null){
               riadok = bufferedReader.readLine();
               System.out.println(riadok);
           }
                bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void myFileReader(String cestaKSuboru){
        try {
            FileReader fileReader = new FileReader(cestaKSuboru);
/*
           int a = fileReader.read();
            System.out.println("cislo je :" + a);
            char b = (char) a;
            System.out.println("char je : " + b);
*/
            int pocetRiadkov = 0;
            int nejakyInt = 0;
            while ( nejakyInt != -1 ){
                nejakyInt = fileReader.read();
                if(nejakyInt == '\n' || nejakyInt == -1){
                    pocetRiadkov++;
                }
                if(nejakyInt > -1)
                    System.out.print( (char)nejakyInt);
            }
            fileReader.close();
            System.out.println("\npocet riadkov je: " + pocetRiadkov);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
