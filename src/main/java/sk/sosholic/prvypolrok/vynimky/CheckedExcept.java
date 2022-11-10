package sk.sosholic.prvypolrok.vynimky;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;

public class CheckedExcept {
    public static void main(String[] args) {
        try {
            connectDva();
        } catch (IOException e) {
            System.out.println(" osetrean chyba IO exception");
        }
    }


    public static void nacitatSubor(){
        BufferedReader bufferedReader= null;
        try{
             bufferedReader = new BufferedReader(new FileReader("text.txt"));
        }catch (FileNotFoundException exception){

            System.out.println("subor nenajdeny zadaj spravnu cestu k suboru");
        }

        try {
            bufferedReader.readLine();
        }catch (IOException exe){
            System.out.println( "nejaka chyba IOexception");
        }
    }

    /*public static void uloha1(){

        SQLException sqlException = new SQLException("nejaka sql chyba");
            throw sqlException;
       }*/


    public static void uloha1(){

        SQLException sqlException = new SQLException("nejaka sql chyba");
        try {
            throw sqlException;
        }catch (SQLException exception){
            System.out.println(" SQL problem ");
        }

    }

   /* public static void uloha2(){
        URL url  = new URL("http://localhost");

        URLConnection  connection = url.openConnection();

            connection.connect();

        }*/

    public static void uloha2(){
        URL url = null;
        try {
            url = new URL("http://localhost");
        }catch (MalformedURLException exception){
            System.out.println( "zla url adresa ");
        }

        URLConnection connection= null;
    try {
       connection = url.openConnection();
        connection.connect();
    }catch (IOException exception){
        System.out.println(" chyba zapisu");
    }

    // pokial je obsluzny program chyby identicky mozme zlucit try catch do jednoho.
  /*  try {
        connection.connect();
    }catch (IOException exception){
        System.out.println(" chyba pripojenia ");
    }*/

    }

    // throws deleguje riesenie vynimky na misto kde bude pouzita metoda connectDva
    // konkratne v main metode sme ju pouzili
    // tam mozme tak isto delegovat pomocou throws  alebo osetrit s try/catch
    public static void connectDva() throws IOException {
        throw new IOException("Cannot connect to " +" nejaka url ");
    }
}
