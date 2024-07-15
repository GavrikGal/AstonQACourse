import java.util.ArrayList;
import java.util.List;


public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }

    public void addAttraction(String name, String workingHours, double cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }


}