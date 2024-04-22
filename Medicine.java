// Medicine class representing a medicine
import java.util.*;
class Medicine {
    private String name;
    private String dosage;
    private List<String> salts;
    private double cost;

    public Medicine(String name, String dosage, List<String> salts, double cost) {
        this.name = name;
        this.dosage = dosage;
        this.salts = salts;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public List<String> getSalts() {
        return salts;
    }

    public double getCost() {
        return cost;
    }
}
