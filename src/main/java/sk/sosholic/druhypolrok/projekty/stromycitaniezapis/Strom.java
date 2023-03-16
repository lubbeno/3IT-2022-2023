package sk.sosholic.druhypolrok.projekty.stromycitaniezapis;

public class Strom {

    private String nazov;
    private String typ;
    private int vyska;
    private String plod;

    public Strom(String nazov, String typ, int vyska, String plod) {
        this.nazov = nazov;
        this.typ = typ;
        this.vyska = vyska;
        this.plod = plod;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public String getPlod() {
        return plod;
    }

    public void setPlod(String plod) {
        this.plod = plod;
    }

    @Override
    public String toString() {
        return "Strom{" +
                "nazov='" + nazov + '\'' +
                ", typ='" + typ + '\'' +
                ", vyska=" + vyska +
                ", plod='" + plod + '\'' +
                '}';
    }
}
