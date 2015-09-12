/*
 *  Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: Cave
 * 	COP3330-001
 * 	Assignment 4
 * 
 * Class to define a single cave location.
 * Composed of the location of the cave on the grid,
 * whether the cave is occupied by a character, whether
 * it is marked (teleport spots can be marked), and what
 * type of cave it is (see Cave.CaveType).
 */

public class Cave {

	private enum CaveType {
		OPEN, BLOCKED, PIT, TELEPORT;		
	}
	
	private boolean occupied, marked;
	private int row, col;
	CaveType type;
	
	//Construct an open cave which is unoccupied and unmarked initially.
	public Cave(int r, int c){
		this.row = r;	//sets the initial row and column
		this.col = c;
		this.occupied = false;	//defaults to unoccupied, unmarked, and of type OPEN
		this.marked = false;
		this.type = CaveType.OPEN;
	}
	
	/** 
	 * Get the column of this cave.
	 */
	public int getCol(){
		return this.col;
	}
	
	/**
	 * Get the row of this cave.
	 */
	public int getRow(){
		return this.row;
	}
	
	/**
	 * Set whether this cave is occupied.
	 */
	public void setOccupied(boolean set){
		this.occupied = set;
	}
	
	/**
	 * Get whether this cave is occupied
	 */
	public boolean isOccupied(){
		return occupied;
	}
	
	/**
	 * Set whether this cave is marked
	 */
	public void setMarked(boolean set){
		this.marked = set;
	}
	
	/**
	 * Get whether this cave is marked.
	 */
	public boolean isMarked(){
		return marked;
	}
	
	/**
	 * Mark this cave as open.
	 */
	public void makeOpen(){
		this.type = CaveType.OPEN;
	}
	
	/**
	 * Get whether this cave is open
	 */
	public boolean isOpen(){
		return (this.type == CaveType.OPEN);
	}
	
	/**
	 * Mark this cave as blocked.
	 */
	public void makeBlocked(){
		this.type = CaveType.BLOCKED;
	}
	
	/**
	 * Get whether this cave is blocked.
	 */
	public boolean isBlocked(){
		return this.type == CaveType.BLOCKED;
	}
	
	/**
	 * Make this cave as a pit.
	 */
	public void makePit(){
		this.type = CaveType.PIT;
	}
	
	/**
	 * Get whether this cave is a pit.
	 */
	public boolean isPit(){
		return this.type == CaveType.PIT;
	}
	
	/**
	 * Mark this cave as a teleport.
	 */
	public void makeTeleport(){
		this.type = CaveType.TELEPORT;
	}
	
	/**
	 * Get whether this cave is a teleport.
	 */
	public boolean isTeleport(){
		return this.type == CaveType.TELEPORT;
	}
}
