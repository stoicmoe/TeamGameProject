package game.engine.monsters;

import game.engine.Role;

public class MultiTasker extends Monster {
	private int normalSpeedTurns;

	public MultiTasker(String name, String description, Role role, int energy,int normalSpeeds) {
		super(name, description,role,energy);
		this.normalSpeedTurns = 0;
	}
	
	public int getNormalSpeedTurns(){
		return normalSpeedTurns;
	}

	public void setNormalSpeedTurns(int normalSpeedTurns) {
		if (this.normalSpeedTurns < 0)
			this.normalSpeedTurns = 0;
		else
			this.normalSpeedTurns = normalSpeedTurns;
	}
	
	
	

}
