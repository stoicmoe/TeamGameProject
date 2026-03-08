package game.engine.cells;

public class TransportCell extends Cell{
	int effect;

	public TransportCell(String name, int effect) {
		super(name);
		this.effect = effect;
	}

	public int getEffect() {
		return effect;
	}
}
