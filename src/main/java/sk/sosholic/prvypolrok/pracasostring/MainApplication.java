package sk.sosholic.prvypolrok.pracasostring;

public class MainApplication {

    public static void main(String[] args) {

        Kniha kniha = new Kniha("J.R.R. Tolkien","",320);
        System.out.println("nazov knihy je: "+ kniha.getNazovKnihy());

        Auto pussyVagon = new Auto("",true);
        System.out.println("nazov auta je: "+ pussyVagon.getNazov());

        /*Strom mojSrom = new Strom("",true, 4,5);
        System.out.println("nazov stromu je: "+ mojStrom.getNazov());*/
    }

}
