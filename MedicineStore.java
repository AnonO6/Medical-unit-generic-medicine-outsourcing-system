// MedicineStore class representing a medicine store
import java.util.*;
abstract class MedicineStore {
    protected List<MedicalObserver> observers;

    public MedicineStore() {
        observers = new ArrayList<>();
    }

    public abstract void addMedicine(Medicine medicine);
    public abstract void removeMedicine(Medicine medicine);
    public abstract boolean checkAvailability(Prescription prescription);
    public abstract void shipMedicines();

    public void addObserver(MedicalObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MedicalObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (MedicalObserver observer : observers) {
            observer.updateAvailability();
        }
    }
}