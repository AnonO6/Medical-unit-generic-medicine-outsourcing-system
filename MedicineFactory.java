// MedicineFactory class to create instances of medicines
import java.util.*;
class MedicineFactory {
    public static Medicine createMedicine(String name, String dosage, List<String> salts, double cost, String source) {
        if ("Generic".equalsIgnoreCase(source)) {
            return new Medicine(name, dosage, salts, cost); // Create generic medicine
        } else {
            return new MedicineDecorator(new Medicine(name, dosage, salts, cost), new ArrayList<>()); // Create private medicine
        }
    }
}