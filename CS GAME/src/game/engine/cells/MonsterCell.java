package game.engine.cells;

import game.engine.monsters.*;

public class MonsterCell extends Cell{
	Monster cellMonster;

	public MonsterCell(String name, Monster cellMonster) {
		super(name);
		this.cellMonster = cellMonster;
	}
	
}
