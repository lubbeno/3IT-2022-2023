package sk.sosholic.prvypolrok.opakovanie;

public class VianocnyStromcek {

    public static void main(String[] args) {

        for (int x = 1; x < 8; x++) {
            System.out.print("\n");
            for (int t = 8-x; t>0; t--){
                System.out.print(" ");
            }
            for (int y = 0; y < x; y++) {
                System.out.print("* ");
            }
        }
    }
}
