package sk.sosholic.prvypolrok.zoo;

public class Hmyz extends Animal{

    private int pocetNoh;
    public Hmyz(String animalType, double value,int pocetNoh) {
        super(animalType, value);
        this.pocetNoh = checkPocetNoh(pocetNoh);
    }
    public int getPocetNoh() {
        return pocetNoh;
    }

    public void setPocetNoh(int pocetNoh) {
        this.pocetNoh = checkPocetNoh(pocetNoh);
    }

    private int checkPocetNoh(int pocetNoh) {
        if(pocetNoh==0 || pocetNoh==6 || pocetNoh==8 || pocetNoh==100){
            return pocetNoh;

        }else {
            return -1;
        }
    }
}
