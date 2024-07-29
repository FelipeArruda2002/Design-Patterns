package gamecharacters;

public abstract class Character implements Prototype {

	private String name;
	private String level;

	public Character() {
	}

	public Character(Character character) {
		this.name = character.name;
		this.level = character.level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", level=" + level + "]";
	}

}
