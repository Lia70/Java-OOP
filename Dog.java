import java.time.LocalDate;

 public class Dog extends Animal {
     public Dog() {
         super();
     }

     public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
         super(name, illness, ownerName, birthday);
     }

    public char[] getName() {
        return null;
    }

    public char[] getIllness() {
        return null;
    }

    public void breathe() {
    }

    public void toWakeUp(String string) {
    }

    

    public Dog(int toGoLength, int swimLength, double flyHeight) {
        super(toGoLength, swimLength, flyHeight);
    }

    }
 


