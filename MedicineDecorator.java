import java.util.ArrayList;
import java.util.List;

// MedicineDecorator class to dynamically add salts to a base medicine
class MedicineDecorator extends Medicine {
    private Medicine baseMedicine;
    private List<String> additionalSalts;

    public MedicineDecorator(Medicine baseMedicine, List<String> additionalSalts) {
        super(baseMedicine.getName(), baseMedicine.getDosage(), new ArrayList<>(baseMedicine.getSalts()), baseMedicine.getCost());
        this.baseMedicine = baseMedicine;
        this.additionalSalts = additionalSalts;
        this.getSalts().addAll(additionalSalts);
    }

    @Override
    public double getCost() {
        // Adjust cost based on additional salts
        return baseMedicine.getCost() * (1 + (additionalSalts.size() * 0.1)); // Example: 10% increase per additional salt
    }
}