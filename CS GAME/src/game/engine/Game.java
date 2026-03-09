package game.engine;

import java.io.IOException;
import java.util.*;
import game.engine.dataloader.DataLoader;
import game.engine.monsters.*;

public class Game {
	private Board board;
	private ArrayList<Monster> allMonsters;
	private Monster player;
	private Monster opponent;
	private Monster current;
	
	public Monster getCurrent() {
		return current;
	}
	public void setCurrent(Monster current) {
		this.current = current;
	}
	public Board getBoard() {
		return board;
	}
	public ArrayList<Monster> getAllMonsters() {
		return allMonsters;
	}
	public Monster getPlayer() {
		return player;
	}
	public Monster getOpponent() {
		return opponent;
	}
	public Game(Role playerRole) throws IOException{
		board = new Board(DataLoader.readCards());
		allMonsters = DataLoader.readMonsters();
		player = selectRandomMonsterByRole(playerRole);
		if(playerRole == Role.LAUGHER)
			opponent = selectRandomMonsterByRole(Role.SCARER);
		else
			opponent = selectRandomMonsterByRole(Role.LAUGHER);
		current = player;
	}
	private Monster selectRandomMonsterByRole(Role role){
		ArrayList<Monster> tmp = new ArrayList<>();
		for(int i=0; i<allMonsters.size(); i++)
			if(allMonsters.get(i).getOriginalRole() == role)
				tmp.add(allMonsters.get(i));
		Random r = new Random();
		int index = r.nextInt(tmp.size());
		if(tmp.isEmpty())
		    return null;
		return tmp.get(index); 
	}
	
}
