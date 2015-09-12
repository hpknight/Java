/*
 *  Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: Miner
 * 	COP3330-001
 * 	Assignment 4
 * 
 * This class represents a Miner. 
 * The miner has a special ability to walk into blocked cave spots and excavate the 
 * cave so that other characters can traverse that spot (essentially, opening up the cave).
 */

public class Miner extends Character {

	/* Field
	 * 
	 */
	
	/** Constructor
	 * Construct a miner at this initial location. 
	 * Makes a call to the parent constructor.
	 */
	public Miner (Cave initLoc) {
		super(initLoc);		//calls the super constructor		
	}
	
	// Methods
	/** Attempt to modify the cave at the given location.
	 * Miners modify a cave by unblocking it.
	 * parameter loc: the cave to attempt to modify
	 */
	public boolean modifyCave (Cave loc) {
		/* If the cave was modified (i.e. it was a blocked cave and no longer is)
		 * return true
		 */
		/* If the cave was not modified
		 * return false
		 */
		if(loc.isBlocked()){
			loc.makeOpen();
			return true;
		}
		return false;
	}
	
	/** A String describing what modification was made by this Miner to a blocked cave.
	 * 
	 */
	public String describeModification() {
		return "destroyed the rocks blocking that area";
	}
	
	/** Override of the move method from the Character class. 
	 * This method checks to see if the Miner can actually move to this new location.
	 * If so, it should make a call to the move method in the super class (which actually performs the move).
	 * If not, simply return false.
	 * parameter to: the new cave to move to
	 */
	public boolean move (Cave to) {
		// If the Miner can move in this new spot, return true
		// If the miner can't move in this new spot, return false
		if(to.isOccupied()){
			return false;
		}
		super.move(to);
		return true;
	}
	
	/** Returns the name of this miner.
	 * 
	 */
	public String getName() {
		return "Miner";
	}

}
