# MEDICAL UNIT GENERIC MEDICINE OUTSOURCING SYSTEM

# Problem Statement:

We have a medical unit available in our college where medicines prescribed by doctors are sourced from private companies, making them expensive. To address this issue, the medical unit has decided to source prescribed medicines from the nearest Generic Medicine Store, established by the Government of India. The Generic Medicine Store offers generic medicines at subsidized rates, providing cost-effective healthcare solutions.

When a doctor prescribes medicine, the prescription is sent to the nearest Generic Medicine Store. If the exact medicine with the precise salt combination is available, it will be shipped directly to the college medical unit. However, if the exact medicine is not available, a base medicine will be decorated with additional salts and shipped separately. For example, if a doctor prescribes 500mg Paracetamol with 200mg Diclofenac and the exact combination is not present, 500mg Paracetamol tablets will be shipped along with 200mg Diclofenac medicine.

If a prescribed medicine is not available at all in the generic medicine store, it will be sourced from private brand medicine stores, ensuring uninterrupted availability of essential medicines.

Medicines will be shipped to the college medical unit every day between 7:00 PM to 8:00 PM, after which patients can collect their medicines from the medical unit.

# To do:

1. Calculate the cost of medicines sourced from the generic medicine store and compare it with the cost of the same prescribed medicine from private companies.
2. Handle scenarios where a prescribed medicine is not available at the generic medicine store by considering alternative medicines or salts of the same type.

This problem statement outlines the need to optimize the sourcing of medicines for the college medical unit, ensuring cost-effectiveness and uninterrupted availability for patients.

# KEY CLASSES

1. Medicine: This class represents a medicine, containing attributes such as name, dosage, salts, and cost.
2. Prescription: This class represents a prescription given by a doctor, containing a list of medicines with their required dosages.
3. MedicineStore: This class represents a medicine store, either generic or private, from which medicines can be sourced.
4. GenericMedicineStore: A subclass of MedicineStore, representing a generic medicine store where medicines are available at subsidized rates.
5. PrivateMedicineStore: A subclass of MedicineStore, representing a private medicine store where medicines are available at regular rates.
6. CostCalculator: This class implements the Strategy pattern, providing different methods for calculating the cost of medicines depending on the source (Generic or Private).
7. MedicineDecorator: This class implements the Decorator pattern, allowing additional salts to be added dynamically to a base medicine.
8. MedicineFactory: This class implements the Factory pattern, responsible for creating instances of medicines regardless of their source.
9. MedicalUnit: This class represents the medical unit in the college, which will interact with the medicine stores to fulfill prescriptions.
10. Observer: This class implements the Observer pattern, allowing the MedicalUnit to observe changes in medicine availability and receive notifications.

# DESIGN PATTERNS UTILIZED:

1. Strategy Pattern - For dynamically selecting the method for calculating costs of medicines depending on the source (Generic or Private).
2. Decorator Pattern - For dynamically adding additional salts to a base medicine when it's necessary to match a prescribed combination.
3. Factory Pattern - For creating instances of medicine regardless of its type (Generic or Private).
4. Observer Pattern - For sending notifications to the medical unit when certain actions occur, such as availability checks and shipments.
