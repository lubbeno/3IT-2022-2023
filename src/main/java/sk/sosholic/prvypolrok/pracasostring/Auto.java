package sk.sosholic.prvypolrok.pracasostring;

public class Auto {


    private String nazov;
    private boolean jeNastartovane;

    // zakladny nazov
    public Auto(String nazov, boolean jeNastartovane) {
        if(nazov.length() == 0){
            this.nazov = "zakladny nazov";
        }else {
            this.nazov = nazov;
        }
        this.jeNastartovane = jeNastartovane;
    }

    public Auto(){

    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void setJeNastartovane(boolean jeNastartovane) {
        this.jeNastartovane = jeNastartovane;
    }

    public String getNazov() {
        return nazov;
    }
}
