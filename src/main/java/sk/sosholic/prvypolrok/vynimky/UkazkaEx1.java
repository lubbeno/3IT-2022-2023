package sk.sosholic.prvypolrok.vynimky;

public class UkazkaEx1 {

    public static void main(String[] args) {

        System.out.println("tu je nejaky kod ");
        System.out.println("vyhodime chybu");
        throw new RuntimeException("mame runtimeException");

        System.out.println( " a toto nikdy nenastane ");

    }

    public static int cisloZPola(){
        int[] pole = new int[]{1,3,4};
        return pole[6];
    }

}
