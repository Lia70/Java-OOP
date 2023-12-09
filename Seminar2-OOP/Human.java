public abstract class Human extends Animal implements Speakable {
    public Human(String name) {
        super(name, null, 2);
    }

    @Override
    public void speak() {
        System.out.printf("Hello! My name is %s%n", this.getName());
    }

    private Object getName() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.getName());
    }

    private Object getType() {
        return null;
    }

    @Override
    public void hunt() {}

    public abstract void work();
}


public abstract class Human implements Illness {
    private String name;

    @Override
    public void getIll() {
    }

    // Конструкторы
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

