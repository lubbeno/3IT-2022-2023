package sk.sosholic.prvypolrok.vynimky;

public class UkazkaEx1 {

    public static void main(String[] args) {
        System.out.println("tu je nejaky kod ");
        System.out.println("vyhodime chybu");
        RuntimeException re = new RuntimeException("mame runtimeException a premennej");
        // throw new RuntimeException("mame runtimeException");
        // throw re;
        // System.out.println( " a toto nikdy nenastane ");
        int cislo = cisloZPola();
        System.out.println("zobraz mi cislo: " + cislo);


        System.out.println(" a tu mozme pokracovat ");
    }



    public static int cisloZPola(){
        int[] pole = new int[]{1,3,4};
        int cislo;

             cislo =  pole[6];

        return cislo;
    }
}
