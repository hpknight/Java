/* 
 * Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: Filler
 * 	COP3330-001
 * 	Assignment 4
 * 
 * This class represents a Filler.
 * The Filler has a special ability to walk into pits and fill the pit with 
 * sand so that it is safe for other characters to walk into this cave in the future.
 */

public class Filler extends Character {

	/* Field
	 * 
	 */
	
	/** Constructor
	 * Construct a filler at this initial location.
	 * Makes a call to the parent constructor.
	 */
	public Filler (Cave initLoc) {
		super(initLoc);		//calls the super constructor
	}
	
	//Methods
	/** Attempt to modify the cave at the given location.
	 * Fillers modify a cave by filling in a pit.
	 * parameter loc: the Cave to attempt to modify
	 */
	public boolean modifyCave(Cave loc) {
		/* If the cave was modified (i.e. if the pit was filled in)
		 * return true
		 */
		//If the cave wasn't modified, return false
		if(loc.isPit()){
			loc.makeOpen();
			return true;
		}
		return false;
		
	}
	
	/** A String describing what modification was made by this Filler to a pit.
	 * 
	 */
	public String describeModification() {
		return "pit was filled in";
	}
	
	/** Override of the move method from the Character class. 
	 * This method checks to see if the Filler can actually move to this new location.
	 * If so, it should make a call to the move method in the super class (which actually performs the move).
	 * If not, simply return false.
	 * parameter to: the new cave to move to
	 */
	public boolean move (Cave to) {
		// If the Filler can move in this new spot, return true
		// If the miner can't move in this new spot, return false
		
		if(to.isBlocked() || to.isOccupied()){	//if the cave is blocked adventurer will not move
			return false;
		}
		super.move(to);		//calls the super move cave method to move
		return true;		//tells the caller that the move was successful
	}
	
	/** The name of this filler.
	 * 
	 */
	public String getName() {
		return "Filler";
	}

}
