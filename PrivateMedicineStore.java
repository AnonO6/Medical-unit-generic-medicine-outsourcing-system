
// PrivateMedicineStore class representing a private medicine store
import java.util.*;
class PrivateMedicineStore extends MedicineStore {
    private List<Medicine> medicines;

    public PrivateMedicineStore() {
        super();
        medicines = new ArrayList<>();
    }

    @Override
    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
        notifyObservers();
    }

    @Override
    public void removeMedicine(Medicine medicine) {
        medicines.remove(medicine);
        notifyObservers();
    }

    @Override
    public boolean checkAvailability(Prescription prescription) {
        for (Medicine medicine : prescription.getMedicines()) {
            if (!medicines.contains(medicine)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void shipMedicines() {
        // Implementation to ship medicines to the college medical unit
        System.out.println("Shipping medicines from Private Medicine Store...");
    }
}