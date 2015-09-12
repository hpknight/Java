/*
 *  Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: Adventurer
 * 	COP3330-001
 * 	Assignment 4
 *
 * Class to represent an Adventurer. The Adventurer has a special ability to walk into teleport spots
 * without teleporting and mark the spots so that other characters can see the spot has a teleporter
 * (by default teleport spots are not visible to the naked eye).
 */
public class Adventurer extends Character{
	
	/**
	 * Construct an adventurer at this initial location.
	 * You should make a call the parent constructor here.
	 */
	public Adventurer(Cave initLoc){
		super(initLoc);		//calls the super constructor
	}
	
	/**
	 * Attempt to modify the cave at the given location.
	 * Adventurers modify a cave by marking it.
	 * loc - The cave to attempt to modify.
	 * Returns True if the cave was modified (i.e. it is a teleport cave), false otherwise.
	 */
	public boolean modifyCave(Cave loc){
		if(loc.isTeleport()){
			return true;
		}
		return false;
	}
	
	/**
	 * A String describing what modification was made by this
	 * Adventurer to a teleporter cave.
	 */
	public String describeModification(){
		return "marked this spot as a teleporter";
	}
	
	/**
	 * Override of the move method from the Character class.
	 * This method checks to see if the Adventurer can actually move to this new location.
	 * If so, it should make a call to the move method in the super class (which actually performs the move).
	 * If not, simply return false. Take special note that this method should return true whether or not this
	 * is a good move for the Adventurer (i.e. even if it's a pit, it's a legal move. Just one that
	 * happens to result in an untimely death).
	 * overrides move in class Character
	 * to - The new cave to move to.
	 * Returns True if the adventurer can successfully move to this new spot, false otherwise. 
	 */
	public boolean move(Cave to){
		to.setMarked(true);	//sets new location marker to true
		if(to.isBlocked() || to.isOccupied()){	//if the cave is blocked adventurer will not move
			return false;
		}
		super.move(to);		//calls the super move cave method to move
		return true;		//tells the caller that the move was successful
	}
	
	/**
	 * The name of this adventurer.
	 */
	public String getName(){
		return "Adventurer";
	}
	
}
