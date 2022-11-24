package sk.sosholic.prvypolrok.overloaded;

public class OverloadedMain {

    public static void main(String[] args) {
       convertToCentimeters(140);
       convertToCentimeters(14,200);

        System.out.println(getDurationString( 23,934));
    }

    // 1 inch = 2.54 cm
    static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    //1 feet = 12 inches
    static double convertToCentimeters(int feets, int inches){
        double feetsToInches = feets *12;
        double totalInches = feetsToInches + inches;
        // return convertToCentimeters(totalInches);
        return totalInches * 2.54;
    }

    //add valiation sec >=0
    static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutyCele = seconds /60;
            int zostatokSekund = seconds % 60;
            int hours = minutyCele /60;
            int reminderMinutes = minutyCele %60;
            return  hours + "Hod " + reminderMinutes+ "Min "+ zostatokSekund+"Sec";
        }else{
            return "Hodnota je mensia ako 0";
        }
    }

    // minutes >=0  0 <= seconds <=59
    static String getDurationString(int minutes, int seconds){
        if(minutes >= 0) {
            if(seconds >=0 && seconds <=59) {
                    int seconds1 = minutes*60;
                return getDurationString(seconds + seconds1);
            }else {
                return "sekundy su mimo rozahu 0 <= secondu <=59";
            }
        }else {
            return "Minuty su mensie ako 0";
        }
    }






























/*

    static double convertToCentimeters(int inches){
        return inches *2.54;
    }
    static double convertToCentimeters(int feets, int inches){
        return convertToCentimeters((feets *12) + inches);
    }
*/


   /* static String getDurationString(int seconds){

        int minutes = seconds / 60;
        int hours = minutes / 60;

        int reminderSeconds  = seconds % 60;
        int reminderMinutes = minutes % 60;

        return  hours + "Hod " + reminderMinutes+ "Min "+ reminderSeconds+"Sec";
    }

    // minutes >=0  0 <= seconds <=59
    static String getDurationString(int minutes, int seconds){
        int seconds1 = minutes * 60;
        return getDurationString( seconds + seconds1);

    }*/

}
