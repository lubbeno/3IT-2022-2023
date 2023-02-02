package sk.sosholic.druhypolrok.citaniezapis;

import sk.sosholic.prvypolrok.opakovanie.Osoba;

public class BufferedWF {
    private FileWriter fileWriter;
    private Osoba osoba;

    public BufferedWF(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public BufferedWF(FileWriter fileWriter, Osoba osoba) {
        this.fileWriter = fileWriter;
        this.osoba = osoba;
    }
}
