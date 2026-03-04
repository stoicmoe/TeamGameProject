package game.engine.monsters;

public class Monster {
private String name;
private String description;
//private Role originalRole;

//private Role role;
private int energy;
private int position;
private boolean frozen;
private boolean shielded;
private int confusionTurns;


public Monster(String name, String description, int energy){
	this.name = name;
	this.description = description;
	// this.originalRole = originalRole;
	this.energy = energy;
	
	this.position = 0;
	this.confusionTurns = 0;
	this.frozen = false;
	this.shielded = false;
	
}


public String getName() {
	return name;
}


public String getDescription() {
	return description;
}


public int getEnergy() {
	return energy;
}


public int getPosition() {
	return position;
}


public boolean isFrozen() {
	return frozen;
}


public boolean isShielded() {
	return shielded;
}


public int getConfusionTurns() {
	return confusionTurns;
}

// public Role getRole(){
// return Role;
//}

//public Role getOriginalRole(){
//return originalRole;
//}




}