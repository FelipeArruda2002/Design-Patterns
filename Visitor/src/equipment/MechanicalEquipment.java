package equipment;

public class MechanicalEquipment extends Equipment {
	private double maintenanceCost;

	public MechanicalEquipment(String name, double maintenanceCost) {
		super(name);
		this.maintenanceCost = maintenanceCost;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	@Override
	void accept(EquipmentVisitor equipmentVisitor) {
		equipmentVisitor.visit(this);
	}
}
