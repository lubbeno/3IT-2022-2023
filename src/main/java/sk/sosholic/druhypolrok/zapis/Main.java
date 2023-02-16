package sk.sosholic.druhypolrok.zapis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("nejakySubor.txt");
        file.write("moje meno je " + System.getProperty("user.name") );
        file.close();

        File f = new File("","");
/*
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        writer.write("vlozeny text do suboru text.txt");
        writer.close();*/

    }
}
