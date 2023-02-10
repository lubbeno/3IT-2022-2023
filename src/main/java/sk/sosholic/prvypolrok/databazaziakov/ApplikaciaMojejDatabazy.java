package sk.sosholic.prvypolrok.databazaziakov;

import java.beans.PropertyEditorSupport;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ApplikaciaMojejDatabazy {
    static List<Ziak> ziakList = new ArrayList<>();
    private static boolean exit = false;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ziaci();
        vypisList();
        //System.out.println(ziakList.toString());
        System.out.println(" Moja databaza spoluziakov ");
        while (!exit) {
            Mojemenu();
            System.out.print("Zadaj moznost: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    vypnutieAplikacie();
                    break;
                case 1:
                    pridatZiaka();
                    break;
                case 2:
                    zmazanieZiaka();
                    break;
                case 3:
                    zobrazJednohoZiaka();
                    break;
                case 4:
                    System.out.println(ziakList.toString());
                    break;
                case 5:
                    ziakSNajvescimVekom();
                    break;
                case 6:
                    vypisZoznamDoSuboru("zoznamZiakov.txt");
                    break;
            }
        }
    }

    private static void vypisZoznamDoSuboru(String nazovsuboru){
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(nazovsuboru));
           for (Ziak ziak : ziakList){
            writer.write(ziak.toString() + "\n");
           }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void ziaci(){
        ziakList.add(new Ziak("Janko","Hrasko",17));
        ziakList.add(new Ziak("Peto","Mrkva",18));
        ziakList.add(new Ziak("Edo","Jablko",19));
    }

    private static void vypisList(){
       for(int i=1;i<=ziakList.size();i++){
           System.out.println(i+". "+ziakList.get(i-1));
       }
    }
    private static void Mojemenu(){
        System.out.println("ak chces ukocit applikaciu stlac 0");
        System.out.println("ak chces vytovrit zaznam stlac 1");
        System.out.println("ak chces zmazat zaznam stlac 2");
        System.out.println("ak chces zobrazit zaznam jednoho ziaka stlac 3");
        System.out.println("ak chces zobrazit CELY zoznam stlac 4");
        System.out.println("ak chces zobrazit Ziaka s najvacsim vekom");
    }

    private static void pridatZiaka(){
        System.out.print("Zadaj meno: ");
        String meno = scanner.next();
        System.out.println("meno je : " + meno);
        System.out.print("Zadaj priezvisko: ");
        String priezvisko = scanner.next();
        System.out.println("priezvisko je : " + priezvisko);
        System.out.print("Zadaj vek: ");
        int vek = scanner.nextInt();
        Ziak ziak = new Ziak(meno, priezvisko, vek);
        ziakList.add(ziak);
    }

    private static void zobrazJednohoZiaka(){
        System.out.print("Zadaj poradie ziaka na zobrazenie: ");
        int cislo = scanner.nextInt();
        if (cislo > ziakList.size()) {
            System.out.println("Cislo je mimo rozsah");
        } else if (cislo < 0) {
            System.out.println("Cislo je mimo rozsah");
        } else
        {
            Ziak ziakNaZobrazenie=  ziakList.get(cislo - 1);
            System.out.println("ziak na poradi "+ cislo + " je " + ziakNaZobrazenie);
        }
    }

    private static void ziakSNajvescimVekom(){
        int poradie = 0;
        for (int i = 0; i < ziakList.size(); i++) {
            // Ziak ziak1 = ziakList.get(i);
            if (ziakList.get(poradie).getVek() < ziakList.get(i).getVek()) {
                poradie = i;
            }
        }
        System.out.println("Ziak s najvacsim vekom je " + ziakList.get(poradie));
    }
    private static void zmazanieZiaka(){
        vypisList();
        System.out.print("Vyber cislo ziaka ktoreho chces zmazat");
        //TODO urobit if esle podminky ak zadame zle cisla nam vypise "Chyba zle cisla"
                  /*  int menoNaZmazanie = scanner.nextInt();
                    ziakList.remove(menoNaZmazanie - 1);*/
        try {
            int menoNaZmazanie=scanner.nextInt();
            ziakList.remove(menoNaZmazanie-1);
        }catch (Exception ex){
            System.out.println("chyba clen nezmazany :" + ex.getMessage());
            scanner.nextLine();
        }
    }
    private static void vypnutieAplikacie(){
        exit = true;
        System.exit(0);
        System.out.println("Applikacia sa vypina");
    }
}
