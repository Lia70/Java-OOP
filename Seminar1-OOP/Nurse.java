import java.util.ArrayList;
import java.util.List;

public class Nurse extends Human {

        public Nurse (String name) {
            super(name);
        }
    
    
        @Override
        public String getName() {
            return super.getName();
        }
        public void heal() {};

        @Override
        public void getIll() {};

        public List<Nurse> getDoctors() {
            List<Nurse> nurses = new ArrayList<>();
            for (Nurse nurse : nurses) {
                nurses.add((Nurse) nurse);
            }
            return nurses;
        }
}
