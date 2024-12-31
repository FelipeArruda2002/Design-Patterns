package equipment;

public class ElectricalEquipment extends Equipment {
    private double energyConsumption;

    public ElectricalEquipment(String name, double energyConsumption) {
        super(name);
        this.energyConsumption = energyConsumption;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }
}