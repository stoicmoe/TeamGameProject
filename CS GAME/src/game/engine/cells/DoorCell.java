package game.engine.cells;
import game.engine.*;

public class DoorCell extends Cell{
	Role role;
	int energy;
	boolean activated;

	public DoorCell(String name, Role role, int energy, boolean activated) {
		super(name);
		this.role = role;
		this.energy = energy;
		this.activated = activated;
	}
	public Role getRole() {
		return role;
	}
	public int getEnergy() {
		return energy;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
}
