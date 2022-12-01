package sk.sosholic.prvypolrok.zoo;

public class Animal {

    private String animalType;
    private double value;


    public Animal(String animalType, double value) {
        if(value<=0){
         this.value = 0;
        }else{
        this.value = value;
        }
        if(animalType.equals("")){
          this.animalType = "Student 3TPI";
        }else{
          this.animalType= animalType;
        }

      //  this.animalType = checkName(animalType);
     //   this.value = nubmerCheck(value);
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = checkName(animalType);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = nubmerCheck(value);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animaltype='" + animalType + '\'' +
                ", value=" + value +
                '}';
    }

    private double nubmerCheck(double number){
        if(number < 0){
            return 0.0;
        }else
            return number;
    }

    private String checkName(String name){
        if(name.trim().length()==0){
            return "student 3 TPI";
        }else {
            return name;
        }
    }
}
