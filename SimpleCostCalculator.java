// Concrete implementation of CostCalculator for calculating costs
class SimpleCostCalculator implements CostCalculator {
    @Override
    public double calculateCost(Medicine medicine) {
        return medicine.getCost();
    }
}