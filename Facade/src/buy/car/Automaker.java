package buy.car;

public class Automaker {
	
	private Engine engine;
    private Chassi chassi;
    private ElectricalSystem electricalSystem;

    public Automaker(Engine engine, Chassi chassi, ElectricalSystem electricalSystem) {
		this.engine = engine;
		this.chassi = chassi;
		this.electricalSystem = electricalSystem;
	}

	public void assembleCar() {
        engine.assembleEngine();
        chassi.assembleChassis();
        electricalSystem.assembleElectricalSystem();
    }

    public void checkCar() {
        engine.checkEngine();
        chassi.checkChassis();
        electricalSystem.verifyElectricalSystem();
    }

}
