package equipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentManager {
    private List<Equipment> equipmentList = new ArrayList<>();

    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }

    public void calculateStatistics() {
        double totalEnergyConsumption = 0.0;
        double totalMaintenanceCost = 0.0;
        double totalFlowRate = 0.0;

        for (Equipment equipment : equipmentList) {
            if (equipment instanceof ElectricalEquipment) {
                totalEnergyConsumption += ((ElectricalEquipment) equipment).getEnergyConsumption();
            } else if (equipment instanceof MechanicalEquipment) {
                totalMaintenanceCost += ((MechanicalEquipment) equipment).getMaintenanceCost();
            } else if (equipment instanceof HydraulicEquipment) {
                totalFlowRate += ((HydraulicEquipment) equipment).getFlowRate();
            }
        }

        System.out.println("Total Energy Consumption: " + totalEnergyConsumption);
        System.out.println("Total Maintenance Cost: " + totalMaintenanceCost);
        System.out.println("Total Flow Rate: " + totalFlowRate);
    }
}