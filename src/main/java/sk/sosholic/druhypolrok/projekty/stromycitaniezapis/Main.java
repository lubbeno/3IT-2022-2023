package sk.sosholic.druhypolrok.projekty.stromycitaniezapis;

import sk.sosholic.druhypolrok.projekty.nacitanieaut.Automobil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Strom> stromy = zoSuboruList("stromy.txt");
        zListuSubor(stromy);

    }

    public static List<Strom> zoSuboruList(String cestaKSuboru) throws IOException {
        List<Strom> stromy = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader( cestaKSuboru));
        String line = "";
        while ( line  != null){
            line = br.readLine();
            if(line != null){
                String[] mojePole = line.split(",");
                Strom strom = new Strom(mojePole[0],mojePole[1],
                                        Integer.parseInt(mojePole[2]),mojePole[3]);
                stromy.add(strom);
            }
        }
        br.close();
        return stromy;
    }

     public static void zListuSubor(List<Strom> stromy) throws IOException {
         BufferedWriter vystupnySubor = new BufferedWriter(
                                            new FileWriter("stromyVystup.txt"));
            for (Strom strom : stromy){
                /// vysledok stringu ma byt:  jasen-listnay-23-nema plod
              String aktualnyRiadok =strom.getNazov()+"-"+strom.getTyp()+"-"+
                                    strom.getVyska()+"-"+strom.getPlod();
                vystupnySubor.write(aktualnyRiadok);
                vystupnySubor.newLine();
            }
         vystupnySubor.close();
     }
}
