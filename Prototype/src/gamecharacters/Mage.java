package gamecharacters;

public class Mage extends Character {
	
	public Mage(Character character) {
		super(character);
	}
	
	public Mage() {
	}

	@Override
	public Prototype clonar() {
		return new Mage(this);
	}

}
