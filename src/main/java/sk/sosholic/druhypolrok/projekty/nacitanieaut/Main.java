package sk.sosholic.druhypolrok.projekty.nacitanieaut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            naciatAutomobil("auta.txt");
        } catch (IOException e) {
            System.out.println(" subor sa nenacital ");
        }
    }

    private static List<Automobil> naciatAutomobil(String subor) throws IOException {
        List<Automobil> auta = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader( subor));
           String line = "";
        while ( line  != null){
            line = br.readLine();
                if(line != null){
                    String[] mojePole = line.split(",");
                    Automobil auto = new Automobil(mojePole[0],mojePole[1],mojePole[2]);
                    auta.add(auto);
                }
        }
        br.close();
        return auta;
    }
}
