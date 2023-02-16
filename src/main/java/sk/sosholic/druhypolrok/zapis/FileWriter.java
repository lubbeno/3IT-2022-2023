package sk.sosholic.druhypolrok.zapis;

public class FileWriter {

    String cestaKsuboru;
    boolean append;

    public FileWriter(String cestaKsuboru) {
        this.cestaKsuboru = cestaKsuboru;
        this.append = false;
    }

    public FileWriter(String cestaKsuboru, boolean append) {
        this.cestaKsuboru = cestaKsuboru;
        this.append = append;
    }
}
