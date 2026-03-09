package game.engine.monsters;

import game.engine.*;

public abstract class Monster {
private String name;
private String description;
private Role originalRole;

private Role role;
private int energy;
private int position;
private boolean frozen;
private boolean shielded;
private int confusionTurns;


public Monster(String name, String description, Role originalRole, int energy){
	this.name = name;
	this.description = description;
	this.originalRole = originalRole;
	this.energy = energy;
	this.role = originalRole;
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

public Role getRole(){
 return role;
}

public Role getOriginalRole(){
 return originalRole;
}

public void setEnergy(int energy) {
	if (energy < 0)
		this.energy = 0;
	else 
		this.energy = energy;
}


public void setPosition(int position) {
	this.position = position;
}


public void setFrozen(boolean frozen) {
	this.frozen = frozen;
}


public void setShielded(boolean shielded) {
	this.shielded = shielded;
}


public void setConfusionTurns(int confusionTurns) {
	this.confusionTurns = confusionTurns;
}

public void setRole(Role role){
	 this.role = role;
}

public int compareTo(Monster o){
	return Integer.compare(this.position, o.position);
}





}