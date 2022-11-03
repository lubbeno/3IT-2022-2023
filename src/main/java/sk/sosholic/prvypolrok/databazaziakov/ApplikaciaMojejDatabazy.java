package sk.sosholic.prvypolrok.databazaziakov;

import java.beans.PropertyEditorSupport;
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
                    exit = true;
                    System.exit(0);
                    System.out.println("Applikacia sa vypina");
                    break;

                case 1:
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
                    break;
                case 2:
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
                    break;

                case 3:
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
                    break;
                case 4:
                    System.out.println(ziakList.toString());
                    break;
                case 5:
                    int poradie = 0;
                    for (int i = 0; i < ziakList.size(); i++) {
                       // Ziak ziak1 = ziakList.get(i);
                        if (ziakList.get(poradie).getVek() < ziakList.get(i).getVek()) {
                            poradie = i;
                        }
                    }
                    System.out.println("Ziak s najvacsim vekom je " + ziakList.get(poradie));

            }
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
        System.out.println("ak chces zobrazit zaznam stlac 3");
        System.out.println("ak chces zobrazit CELY zoznam stlac 4");
        System.out.println("ak chces zobrazit Ziaka s najvacsim vekom");
    }
}
