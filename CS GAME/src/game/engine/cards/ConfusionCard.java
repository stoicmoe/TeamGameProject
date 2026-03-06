package game.engine.cards;

public class ConfusionCard extends Card{
	private final int duration;
	
	ConfusionCard(String name, String description, int rarity, int duration){
		super(name, description, rarity, true);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
	
	

}
