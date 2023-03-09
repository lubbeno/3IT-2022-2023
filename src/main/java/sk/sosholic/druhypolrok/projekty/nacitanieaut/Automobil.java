package sk.sosholic.druhypolrok.projekty.nacitanieaut;

public class Automobil {

    private String zacka;
    private String druhMotora;
    private String druhPaliva;

    public Automobil(String zacka, String druhMotora, String druhPaliva) {
        this.zacka = zacka;
        this.druhMotora = druhMotora;
        this.druhPaliva = druhPaliva;
    }

    public String getZacka() {
        return zacka;
    }

    public void setZacka(String zacka) {
        this.zacka = zacka;
    }

    public String getDruhMotora() {
        return druhMotora;
    }

    public void setDruhMotora(String druhMotora) {
        this.druhMotora = druhMotora;
    }

    public String getDruhPaliva() {
        return druhPaliva;
    }

    public void setDruhPaliva(String druhPaliva) {
        this.druhPaliva = druhPaliva;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "zacka='" + zacka + '\'' +
                ", druhMotora='" + druhMotora + '\'' +
                ", druhPaliva='" + druhPaliva + '\'' +
                '}';
    }
}
