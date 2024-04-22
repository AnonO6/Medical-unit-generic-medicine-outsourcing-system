// Prescription class representing a prescription
import java.util.*;
class Prescription {
    private List<Medicine> medicines;

    public Prescription() {
        medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void removeMedicine(Medicine medicine) {
        medicines.remove(medicine);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Medicine medicine : medicines) {
            totalCost += medicine.getCost();
        }
        return totalCost;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }
}
