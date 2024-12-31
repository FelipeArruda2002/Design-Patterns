package equipment;

public class HydraulicEquipment extends Equipment {
    private double flowRate;

    public HydraulicEquipment(String name, double flowRate) {
        super(name);
        this.flowRate = flowRate;
    }

    public double getFlowRate() {
        return flowRate;
    }
}