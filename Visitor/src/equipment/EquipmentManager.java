package equipment;

import java.util.ArrayList;
import java.util.List;

class EquipmentManager {
	private List<Equipment> equipmentList = new ArrayList<>();

	public void addEquipment(Equipment equipment) {
		equipmentList.add(equipment);
	}

	public void calculateStatistics() {
		EquipmentStatisticsVisitor visitor = new EquipmentStatisticsVisitor();

		for (Equipment equipment : equipmentList) {
			equipment.accept(visitor);
		}

		System.out.println("Total Energy Consumption: " + visitor.getTotalEnergyConsumption());
		System.out.println("Total Maintenance Cost: " + visitor.getTotalMaintenanceCost());
		System.out.println("Total Flow Rate: " + visitor.getTotalFlowRate());
	}
}
