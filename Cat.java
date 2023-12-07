import java.time.LocalDate;

 public class Cat extends Animal {
     public Cat() {
         super();
     }

     public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
         super(name, illness, ownerName, birthday);
     }



    public void setName(String string) {
    }

    public char[] getName() {
        return null;
    }

    public void liveCycle() {
    }

    @Override
    public void swim() {}

    @Override
    public void fly() {}

    public void toGo() {}

    public void toWakeUp() {
    }
    public Cat(int toGoLength, int swimLength, double flyHeight) {
        super(toGoLength, swimLength, flyHeight);
    }

}

 

