package equipment;

public class EquipmentStatisticsVisitor implements EquipmentVisitor {
	
	private double totalEnergyConsumption = 0.0;
	private double totalMaintenanceCost = 0.0;
	private double totalFlowRate = 0.0;

	@Override
	public void visit(ElectricalEquipment electricalEquipment) {
		totalEnergyConsumption += electricalEquipment.getEnergyConsumption();
	}

	@Override
	public void visit(HydraulicEquipment hydraulicEquipment) {
		totalFlowRate += hydraulicEquipment.getFlowRate();
	}

	@Override
	public void visit(MechanicalEquipment mechanicalEquipment) {
		totalMaintenanceCost += mechanicalEquipment.getMaintenanceCost();
	}

	public double getTotalEnergyConsumption() {
		return totalEnergyConsumption;
	}

	public double getTotalMaintenanceCost() {
		return totalMaintenanceCost;
	}

	public double getTotalFlowRate() {
		return totalFlowRate;
	}

}
