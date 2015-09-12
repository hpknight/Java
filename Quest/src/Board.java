/*
 * Scott Tanner and Himan Patel
 * 	Program: AdventureGame
 *  Class: Board
 * 	COP3330-001
 * 	Assignment 4
 * 
 * This class stores information about the board.
 * It contains a 2D array of the board, made up of
 * individual Cave spots.
 */

import java.util.Random;


public class Board {
	
	private Cave[][] board;	//board variable array of caves
	private int rows, cols;	//height and length of the board
	Random rand = new Random();	//random object
	int number;	//integer to store random integers
	/**
	 * Generate a random game board of size rows x cols.
	 * The top left and bottom right should always be open
	 * (the adventurer will start in the top left and the treasure will be in the bottom right).
	 * Otherwise, each spot should be generated with the following probability:
	 * Open 50%, Blocked 20%, Pit 20%, Teleport 10%
	*/
	Board(int rows, int cols){
		this.rows = rows;				//stores the size of the board
		this.cols = cols;
		board = new Cave[rows][cols];	//creates the board
		for(int i = 0; i < rows; i++){			//loops for all rows
			for(int j = 0; j < cols; j++){		//loops for all cols
				board[i][j] = new Cave(i,j);	//creates a new cave
				number = rand.nextInt(10) + 1;	//gets a random number 1-10
				switch (number){
				//50% chance of the cave being open
				case 1: case 2: case 3: case 4: case 5:
					board[i][j].makeOpen();
					break;
				//20% chance of the cave being Blocked
				case 6: case 7:
					board[i][j].makeBlocked();
					break;
				//20% chance of the cave being a pit
				case 8: case 9:
					board[i][j].makePit();
					break;
				//10% chance of the cave being a teleport
				case 10:
					board[i][j].makeTeleport();
					break;
				}
			}
		}
		//opens the cave where the adventurer will start
		board[0][0].makeOpen();
		//opens the cave where the treasure will be
		board[rows-1][cols-1].makeOpen();
	}
	
	/**
	 * Get the cave at location (r,c).
	 * Returns The Cave stored at this location, or null if this spot is not on the board.
	 */
	public Cave getCave(int r, int c){
		return board[r][c];
	}
	
	/**
	 * Check if this location is inside the bounds of the board.
	 * Returns true if this spot is within the bounds of the defined board, false otherwise.
	 */
	public boolean ok(int r, int c){
		if(r >= 0 && r < rows && c >= 0 && c < cols){	//looks if the location is in the bounds of the board
			return true;
		}
		return false;
	}
	
	/**
	 * Get a random unoccupied, open location from the current state of the game board.
	 * Guaranteed not to return the location of the treasure.
	 * Returns the cave stored at the random location chosen.
	 * Will be unoccupied and open.
	 */
	public Cave getUnoccupiedOpenLocation(){
		int row = rand.nextInt(rows);	//gets random numbers within the board's length and height
		int col = rand.nextInt(cols);
		
		if(board[row][col].isOccupied() == false && board[row][col].isOpen() && !(row == rows-1 && col == cols-1)){	//checks if the random space is open, and isnt the treasure spot
			return board[row][col];	//returns the open cave location
		}else{
			return getUnoccupiedOpenLocation();	//else gets a new random space and tries again
		}
	}
}
