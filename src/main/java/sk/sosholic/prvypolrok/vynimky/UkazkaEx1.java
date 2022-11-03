package sk.sosholic.prvypolrok.vynimky;

public class UkazkaEx1 {

    public static void main(String[] args) {
        System.out.println("tu je nejaky kod ");
        System.out.println("vyhodime chybu");
       // RuntimeException re = new RuntimeException("mame runtimeException a premennej");
       // throw new RuntimeException("mame runtimeException");
      // throw re;
       // System.out.println( " a toto nikdy nenastane ");

        // riesenie 1.
/*        try {
            int cislo = cisloZPola();
            System.out.println("zobraz mi cislo: "+ cislo);
        }catch (Exception ex){
            System.out.println("nastala nam chyba  a ta je " + ex.toString());
        }
        System.out.println( " a tu mozme pokracovat ");*/
        int cislo = cisloZPola();
        System.out.println("zobraz mi cislo: "+ cislo);

    }
    public static int cisloZPola(){
        int[] pole = new int[]{1,3,4};
        int cislo;
        try {
             cislo =  pole[6];
        }catch (Exception ex){
            System.out.println(" zle cislo a tak zadame defaultne cislo 0");
            cislo = 0 ;
        }
        return cislo;
    }
}
