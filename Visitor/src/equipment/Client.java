package equipment;

public class Client {
    public static void main(String[] args) {
        EquipmentManager manager = new EquipmentManager();

        // Adicionando equipamentos ao gerenciador
        manager.addEquipment(new ElectricalEquipment("Generator", 5000));
        manager.addEquipment(new MechanicalEquipment("Lathe", 2000));
        manager.addEquipment(new HydraulicEquipment("Pump", 150));
        manager.addEquipment(new ElectricalEquipment("Generator 2", 2500));

        // Calculando estatísticas
        manager.calculateStatistics();
    }
}
