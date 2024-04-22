import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1: Prescription with medicines available at Generic Medicine Store
        System.out.println("Example 1:");
        Prescription prescription1 = new Prescription();
        Medicine paracetamol = MedicineFactory.createMedicine("Paracetamol", "500mg", Arrays.asList("Paracetamol"), 5.0, "Generic");
        Medicine diclofenac = MedicineFactory.createMedicine("Diclofenac", "200mg", Arrays.asList("Diclofenac"), 7.0, "Generic");
        prescription1.addMedicine(paracetamol);
        prescription1.addMedicine(diclofenac);

        // Add medicines to Generic Medicine Store inventory
        GenericMedicineStore genericMedicineStore1 = new GenericMedicineStore();
        genericMedicineStore1.addMedicine(paracetamol);
        genericMedicineStore1.addMedicine(diclofenac);

        MedicalUnit medicalUnit1 = new MedicalUnit(genericMedicineStore1);
        medicalUnit1.receivePrescription(prescription1);
        medicalUnit1.collectMedicines();
        System.out.println("Total Cost: $" + prescription1.getTotalCost());

     // Example 2: Prescription with medicines not available at Generic Medicine Store
        System.out.println("\nExample 2:");
        Prescription prescription2 = new Prescription();
        //Creating new empty medicine store
        GenericMedicineStore genericMedicineStore2 = new GenericMedicineStore();
        Medicine amoxicillin = MedicineFactory.createMedicine("Amoxicillin", "250mg", Arrays.asList("Amoxicillin"), 10.0, "Generic");
        Medicine ibuprofen = MedicineFactory.createMedicine("Ibuprofen", "400mg", Arrays.asList("Ibuprofen"), 8.0, "Generic");
        prescription2.addMedicine(amoxicillin);
        prescription2.addMedicine(ibuprofen);

        if (!genericMedicineStore2.checkAvailability(prescription2)) {
            System.out.println("Medicine is not present in Generic Medicine Store. Choosing Private Medicine Store...");
        }

        // Add medicines to Private Medicine Store inventory
        PrivateMedicineStore privateMedicineStore2 = new PrivateMedicineStore();
        privateMedicineStore2.addMedicine(amoxicillin);
        privateMedicineStore2.addMedicine(ibuprofen);

        MedicalUnit medicalUnit2 = new MedicalUnit(privateMedicineStore2);
        medicalUnit2.receivePrescription(prescription2);
        medicalUnit2.collectMedicines();
        System.out.println("Total Cost: $" + prescription2.getTotalCost());

        // Example 3: Prescription with medicines available at Private Medicine Store
        System.out.println("\nExample 3:");
        Prescription prescription3 = new Prescription();
        Medicine paracetamolPrivate = MedicineFactory.createMedicine("Paracetamol", "500mg", Arrays.asList("Paracetamol"), 6.0, "Private");
        Medicine diclofenacPrivate = MedicineFactory.createMedicine("Diclofenac", "200mg", Arrays.asList("Diclofenac"), 9.0, "Private");
        prescription3.addMedicine(paracetamolPrivate);
        prescription3.addMedicine(diclofenacPrivate);

        // Add medicines to Private Medicine Store inventory
        PrivateMedicineStore privateMedicineStore3 = new PrivateMedicineStore();
        privateMedicineStore3.addMedicine(paracetamolPrivate);
        privateMedicineStore3.addMedicine(diclofenacPrivate);

        MedicalUnit medicalUnit3 = new MedicalUnit(privateMedicineStore3);
        medicalUnit3.receivePrescription(prescription3);
        medicalUnit3.collectMedicines();
        System.out.println("Total Cost: $" + prescription3.getTotalCost());
        
        // Example 4: Prescription with a base medicine and additional salts
        System.out.println("\nExample 4:");
        Prescription prescription4 = new Prescription();
        Medicine paracetamol1 = MedicineFactory.createMedicine("Paracetamol", "500mg", Arrays.asList("Paracetamol"), 5.0, "Generic");
        prescription4.addMedicine(paracetamol);
        
        // Decorate the base medicine with additional salts
        Medicine decoratedParacetamol = new MedicineDecorator(paracetamol1, Arrays.asList("diclofenac", "dihydrocodeine"));
        prescription4.addMedicine(decoratedParacetamol);

        // Add medicines to Generic Medicine Store inventory
        GenericMedicineStore genericMedicineStore4 = new GenericMedicineStore();
        genericMedicineStore4.addMedicine(paracetamol);

        MedicalUnit medicalUnit4 = new MedicalUnit(genericMedicineStore4);
        medicalUnit4.receivePrescription(prescription4);
        medicalUnit4.collectMedicines();
        System.out.println("Total Cost: $" + prescription4.getTotalCost());
    }
}
