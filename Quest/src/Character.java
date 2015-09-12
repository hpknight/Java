/* 
 *  Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: Character
 * 	COP3330-001
 * 	Assignment 4
 * 
 * This class is to store information about a general game character. 
 * It implements the CaveWorker interface which defines specific operations on a cave, 
 * depending on the type of character.
 * Classes Adventurer, Miner, and Filler are descended from this class,
 * and override its methods to model their unique behavior.
 */

public abstract class Character implements CaveWorker {
	
	/* Field
	 * location is the cave that this character is occupying
	 */
	protected Cave location;
	
	/** Constructor
	 * Construct a new character at the initial location
	 */
	public Character (Cave initLoc) {		
		location = initLoc;
		location.setOccupied(true);
		 
	}
	
	// Methods
	/** Get the Cave this character is occupying
	 * 
	 */
	public Cave getLocation() {
		return location;
	}
	
	/** Move this character from his/her current location to the new location.
	 * Marks the old spot as unoccupied and the new spot as occupied. 
	 * Assumes that new location can be moved to by this character.
	 * parameter to: the new location to move to
	 */
	boolean move(Cave to) {
		this.location.setOccupied(false);	//sets old spot to not occupied
		this.location = to;					//sets the character to the new location
		this.location.setOccupied(true);	//sets the new location to occupied
		
		return true;
	}
	
	/** Abstract method to get the name of this character.
	 * Any non-abstract class must implement this method.
	 */
	public abstract String getName();

	@Override
	public boolean modifyCave(Cave loc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String describeModification() {
		// TODO Auto-generated method stub
		return null;
	}

}
