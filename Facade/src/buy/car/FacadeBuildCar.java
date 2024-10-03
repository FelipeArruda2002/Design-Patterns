package buy.car;

public class FacadeBuildCar {
	
	public void buildCar() {
		Engine engine = new Engine();
        Chassi chassi = new Chassi();
        ElectricalSystem electricalSystem = new ElectricalSystem();
        
        Automaker automaker = new Automaker(engine, chassi, electricalSystem);
        
        // O cliente precisa saber detalhes das classes internas
        automaker.assembleCar();
        automaker.checkCar();
	}

}
