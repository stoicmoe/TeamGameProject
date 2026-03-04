package game.engine;

import java.util.ArrayList;
import game.engine.cells.*;
import game.engine.monsters.*;
import game.engine.cards.*;

public class Board {
	private Cell[][] boardCells;
	private static ArrayList<Monster> stationedMonsters;
	private static ArrayList<Card> originalCards;
	private static ArrayList<Card> cards;
	
	public Cell[][] getBoardCells() {
		return boardCells;
	}
	public static ArrayList<Monster> getStationedMonsters() {
		return stationedMonsters;
	}
	public static void setStationedMonsters(ArrayList<Monster> stationedMonsters) {
		Board.stationedMonsters = stationedMonsters;
	}
	public static ArrayList<Card> getOriginalcards() {
		return originalCards;
	}
	public static ArrayList<Card> getCards() {
		return cards;
	}
	public static void setCards(ArrayList<Card> cards) {
		Board.cards = cards;
	}
	
	public Board(ArrayList<Card> readCards){
		boardCells = new Cell[Constants.BOARD_ROWS][Constants.BOARD_COLS];
		stationedMonsters = new ArrayList<>();
		cards = new ArrayList<>();
		originalCards = readCards;
	}
}
