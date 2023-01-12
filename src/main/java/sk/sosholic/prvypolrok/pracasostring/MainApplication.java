package sk.sosholic.prvypolrok.pracasostring;

public class MainApplication {

    public static void main(String[] args) {



        Kniha kniha = new Kniha();

        kniha.nazovKnihy = "Pan Prstenov";
        kniha.setAutor("J.R.R. Tolkien");
        String tolkien = kniha.getAutor();

/*
        Osoba ondrej = new Osoba("Ondrej", "Novak", 55);

        char samohlaska = 'a';
        System.out.println("samohlaska " + samohlaska + " sa nachadza v priezvisku "
                + ondrej.pocetSamohlaskyVPriezvisku(samohlaska) +" krat.");*/

    }

}
