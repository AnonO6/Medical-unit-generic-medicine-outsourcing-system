// GenericMedicineStore class representing a generic medicine store
import java.util.*;
class GenericMedicineStore extends MedicineStore {
    private Map<Medicine, Integer> available;

    public GenericMedicineStore() {
        super();
        available = new HashMap<>();
    }

    @Override
    public void addMedicine(Medicine medicine) {
        available.put(medicine, available.getOrDefault(medicine, 0) + 1);
        notifyObservers();
    }

    @Override
    public void removeMedicine(Medicine medicine) {
        if (available.containsKey(medicine)) {
            int count = available.get(medicine);
            if (count > 1) {
                available.put(medicine, count - 1);
            } else {
                available.remove(medicine);
            }
            notifyObservers();
        }
    }

    @Override
    public boolean checkAvailability(Prescription prescription) {
        for (Medicine medicine : prescription.getMedicines()) {
            if (!available.containsKey(medicine)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void shipMedicines() {
        // Implementation to ship medicines to the college medical unit
        System.out.println("Shipping medicines from Generic Medicine Store...");
    }
}