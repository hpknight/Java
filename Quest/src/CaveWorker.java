/*
 *  Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: CaveWorker
 * 	COP3330-001
 * 	Assignment 4
 * 
 * Interface to describe what modifications are allowed
 * by certain characters and actually carry out those
 * modifications, if applicable to a given spot for a
 * given character type. Remember that you don't implement
 * any methods in an interface, you just give the method prototypes.
 */

public interface CaveWorker {

	/**
	 * Method making modifications to a given cave if this worker can modify this type of cave.
	 */
	boolean modifyCave(Cave loc);
	
	/**
	 * Give a description of the type of modification made.
	 */
	String describeModification();
}
