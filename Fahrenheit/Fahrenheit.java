/**
 * 1. getContentPane() is a method that returns a container that is where you usually 
 * add all of your components instead of adding Component objects directly to a window 
 * such as a JFrame or a JDialog.

2. setLayout() is a method that is used to set the LayoutManager of a Container object. 
LayoutManager objects are supposed to automatically layout your Component objects once the 
LayoutManager is setup. If you call container.setLayoutManager(null); then there is no LayoutManager and you can position your Components in that Container by using methods such as setBounds() etc.

3. A FlowLayout is a simple layout where the container just fills the top row of the 
Container object and then starts the next Component object on the next row.
 * 
 */

import javax.swing.JFrame; 

public class Fahrenheit {

	public static void main(String[] args) { 
		
		// creates and displays temperature converter GUI
		JFrame frame = new JFrame("Fahrenheit"); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how we want our program to close. 
		
		FahrenheitPanel panel = new FahrenheitPanel();
		
		frame.getContentPane().add(panel);
		
		
		frame.pack(); //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
		
		frame.setVisible(true); 
	}
	
	
	
	
}