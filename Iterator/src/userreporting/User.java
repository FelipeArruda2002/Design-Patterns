package userreporting;

import java.time.LocalDate;

public class User {
	private String name;
	private boolean active;
	private LocalDate creationDate;

	public User(String name, boolean active, LocalDate creationDate) {
		this.name = name;
		this.active = active;
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void deactivate() {
		this.active = false;
	}
}
