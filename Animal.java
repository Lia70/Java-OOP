import java.time.LocalDate;

public class Animal {

    private Object name;

    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {
    }

    public Animal() {
    }

    public class Task1 {

        private String name;
        private Illness illness;
        private String ownerName;

        public String getOwnerName() {
            return ownerName;
        }

        private LocalDate birthday;

        public LocalDate getBirthday() {
            return birthday;
        }

        public Task1() {
        }

        public Task1(String name, Illness illness, String ownerName, LocalDate birthday) {
            this.name = name;
            this.illness = illness;
            this.ownerName = ownerName;
            this.birthday = birthday;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Illness getIllness() {
            return illness;
        }

        private void toWakeUp() {
            System.out.println("Animal woke up");
        }

        // private void toWakeUp(String time){
        // System.out.println(getClass().getSimpleName() + " woke up is " + time);
        // }

        private void eat() {
            System.out.println(getClass().getSimpleName() + " ate");
        }

        private void sleep() {
            System.out.println(getClass().getSimpleName() + " go to bed");
        }

        private void play() {
            System.out.println(getClass().getSimpleName() + " go to play");
        }

        public void liveCycle() {
            toWakeUp();
            eat();
            play();
            sleep();
        }

        public void breathe() {
            System.out.println("breathe");
        }
    }


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

    public Animal(int toGoLength, int swimLength, double flyHeight) {
           this.toGoLength = toGoLength;
           this.swimLength = swimLength;
           this.flyHeight = flyHeight;
    }
}
