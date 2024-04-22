// MedicalUnit class representing the college medical unit
class MedicalUnit implements MedicalObserver {
    private MedicineStore medicineStore;
    private Prescription prescription;

    public MedicalUnit(MedicineStore medicineStore) {
        this.medicineStore = medicineStore;
        this.medicineStore.addObserver(this);
    }

    public void receivePrescription(Prescription prescription) {
        this.prescription = prescription;
        boolean availability = medicineStore.checkAvailability(prescription);
        if (availability) {
            medicineStore.shipMedicines();
        } else {
            System.out.println("Medicines not available at the Generic Medicine Store. Sourcing from private medicine store...");
            // Implement logic to source from private medicine store
        }
    }

    public void collectMedicines() {
        // Implementation to collect medicines from the medical unit
        System.out.println("Medicines collected from the Medical Unit.");
    }

    @Override
    public void updateAvailability() {
        System.out.println("Medicine availability updated. Checking prescription...");
        boolean availability = medicineStore.checkAvailability(prescription);
        if (availability) {
            System.out.println("Prescription can now be fulfilled.");
            medicineStore.shipMedicines();
        } else {
            System.out.println("Medicines still not available. Waiting for availability...");
        }
    }
}