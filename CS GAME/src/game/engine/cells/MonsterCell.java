package game.engine.cells;

public class MonsterCell extends Cell{
	Monster cellMonster;

	public MonsterCell(String name, Monster cellMonster) {
		super(name);
		this.cellMonster = cellMonster;
	}
	
}
