package equipment;

public interface EquipmentVisitor {

	void visit(ElectricalEquipment electricalEquipment);

	void visit(HydraulicEquipment hydraulicEquipment);

	void visit(MechanicalEquipment mechanicalEquipment);

}
