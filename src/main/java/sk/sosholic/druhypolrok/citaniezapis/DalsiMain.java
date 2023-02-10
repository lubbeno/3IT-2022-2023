package sk.sosholic.druhypolrok.citaniezapis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DalsiMain {

    public static void main(String[] args) throws IOException {

        String textNaZapis = "Tu je text na zapis";

        // zapiste text do suboru s nazvom OpakovanieZapisu.txt
        // applikaciu pustite s najprv bez pouitia metody close() a s nou
        // vytvorte novy objekt FileWriter a zapiste dalsi string vasho uvazenia
        // do isteho suboru pouzite konstruktor s dvomi atributami.
        //
        FileWriter subor1 = new FileWriter("OpakovnanieZapisu.txt");
        subor1.write(textNaZapis);
        subor1.close();
        // nie je mozne datovy tok je uz uzavrety
     //  subor1.write("volaco test");
      //  subor1.close();
        FileWriter subor2 = new FileWriter("OpakovnanieZapisu.txt",true);

        String zapisDoSuboru2 = "tu zapiseme nieco dalsieho";
        subor2.write("\n");
        subor2.write(zapisDoSuboru2);
        subor2.close();

        FileWriter fileWriter = new FileWriter("text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);




    }
}
