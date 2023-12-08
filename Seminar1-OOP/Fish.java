import java.time.LocalDate;

public class Fish extends Animal {
    private String name;

    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("impossible");
    }

    @Override
    public void toGo() {
        System.out.println("no than to walk");
    }
}