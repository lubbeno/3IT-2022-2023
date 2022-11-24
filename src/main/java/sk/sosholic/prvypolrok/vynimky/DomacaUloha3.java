package sk.sosholic.prvypolrok.vynimky;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DomacaUloha3 {

    public void uloha1(int age) throws EOFException {
        if (age < 1 || age > 99) {
            throw new EOFException("Invalid age");
        }
        int newAge = age;
    }

    public void readFile() {
        String fileName = "file does not exist";
        File file = new File(fileName);

        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void uloha3(){



    }

    public void uloha4(){

    }
}
