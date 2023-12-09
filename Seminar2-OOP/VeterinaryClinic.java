
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic<Swimmable, Speakable, Goable, Flyable> {
    private List<Animal> patients = new ArrayList<>();

    public List<Animal> getPatients() {
        return patients;
    }

    // public void addPatient(Animal patient){
    // patients.add(patient);
    // }
    public VeterinaryClinic addPatient(Animal patient) {
        patients.add(patient);
        return this;
    }

    public void removePatient(Animal patient) {
        patients.remove(patient);
    }

    public List<Goable> getGoable() {
        List<Goable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmingAnimals() {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimmable) swimmingAnimals.add((Swimmable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }
}
