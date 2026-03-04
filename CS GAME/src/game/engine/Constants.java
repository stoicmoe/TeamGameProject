package game.engine;

public final class Constants {
	//Board Constants: 
	public int BOARD_SIZE = 100;
	public int BOARD__ROWS = 10;
	public int BOARD_COLS = 10;
	public int WINNING_POSITION = 99;
	public int STARTING_POSITION = 0;
	//Special Cells Positions Constants:
	public int[] MONSTER_CELL_INDICES = {2,18,34,54,82,88}; 
	public int[] CONVEYOR_CELL_INDICES = {2,18,34,54,82,88}; //(Start of the belt)
	public int[] SOCK_CELL_INDICES = {32, 42, 74, 84, 98}; //(Start of the sock)
	public int[] CARD_CELL_INDICES = {4, 12, 28, 36, 48, 56, 60, 76, 86, 90};
	//Energy Constants:
	public int WININNG_ENERGY = 1000;
	public int MIN_ENERGY = 0;
	//Monster Constants:
	public int MULTITASKER_BONUS = 200;
	public int SCHEMER_STEAL = 10;
	//Cell Constants:
	public int SLIP_PENALTY = 100;
	//Power Constants: 
	public int POWERUP_CONST = 500;
}
