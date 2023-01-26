package sk.sosholic.prvypolrok.pracasostring;

public class Kniha {

   private String autor;
   String nazovKnihy;
    int pocetStran;

    public Kniha(){}

    public Kniha(String autor, String nazovKnihy, int pocetStran){
        this.autor = autor;
        this.nazovKnihy = nazovKnihy;
        this.pocetStran = pocetStran;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }

    public String getNazovKnihy() {
        return nazovKnihy;
    }

    public void setNazovKnihy(String nazovKnihy) {
        this.nazovKnihy = nazovKnihy;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }
}
