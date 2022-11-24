package sk.sosholic.prvypolrok.overloaded;

public class Spustacia {

    public static void main(String[] args) {

        ZoznamZiakov neco = new ZoznamZiakov();
        System.out.println(neco.get());
        System.out.println(neco.get(2));
    }

}
