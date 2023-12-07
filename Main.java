import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); // экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max", new Chumka("chumka"), "petr",
                LocalDate.of(3, 12, 21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        //dog.getIllness().heal();
         dog.toWakeUp("13:22");
         cat.toWakeUp();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();
        

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

    private Object name;

    public void toGo() {
        System.out.println(String.format("%s %s walked away!", this.getType(), this.name));
    }

    private Object getType() {
        return null;
    }
    void fly() {
        System.out.println(String.format("%s %s flied away!", this.getType(), this.name));
    }

    public void swim() {
        System.out.println(String.format("%s %s swam away!", this.getType(), this.name));
    }

    public int swimLength;
    public int toGoLength;
    public double flyHeight;

    public void Animal(int toGoLength, int swimLength, double flyHeight) {
           this.toGoLength = toGoLength;
           this.swimLength = swimLength;
           this.flyHeight = flyHeight;
    }
    
 }

