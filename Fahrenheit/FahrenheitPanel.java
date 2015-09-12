import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*; 

import java.awt.FlowLayout; 

public class FahrenheitPanel extends JPanel{
	
	private JLabel inputLabel, outputLabel, resultLabel; 
	
		private JTextField fahrenheit; 

	// constructor: sets up the GUI component
	public FahrenheitPanel() { 
		inputLabel = new JLabel("Enter Fahrenheit Temperature: ");
		outputLabel = new JLabel("Temperature in Celcious: ");
		resultLabel = new JLabel("??"); 
		
		fahrenheit = new JTextField(5); 
		fahrenheit.addActionListener(new TempListener());
		
		
		JButton myButton = new JButton("Calculate"); 
		myButton.addActionListener(new TempListener()); 
		fahrenheit.addMouseListener(new TempListener()); 
		add(inputLabel); 
		add(fahrenheit); 
		add(outputLabel); 
		add(resultLabel); 
		add(myButton); 
		setPreferredSize(new Dimension(300, 75)); 
		setBackground(Color.cyan); 
		
		
	}
	
	//reprents an action listener for the temperature input field
	public class TempListener implements ActionListener, MouseListener {
		
		
		// performs the conversion when the enter key is pressed in the text field
		public void actionPerformed(ActionEvent event) {
			int fahrenheitTemp, celsiousTemp; 
			
			String text = fahrenheit.getText(); 
			
			fahrenheitTemp = Integer.parseInt(text); 
			celsiousTemp = (fahrenheitTemp - 32) * 5/9; 
			resultLabel.setText(Integer.toString(celsiousTemp)); 
			
		}
		
			public void mousePressed(MouseEvent e) {
			//JOptionPane.showMessageDialog(null, "Mouse is pressed" , "Temperature converter", JOptionPane.ERROR_MESSAGE); 
			
		    }

		    public void mouseReleased(MouseEvent e) {
		    	//JOptionPane.showMessageDialog(null, "Mouse is pressed" , "Temperature converter", JOptionPane.ERROR_MESSAGE); 
				
		    }

		    public void mouseEntered(MouseEvent e) {
		    	//JOptionPane.showMessageDialog(null, "Mouse is entered" , "Temperature converter", JOptionPane.ERROR_MESSAGE); 
				
		    }

		    public void mouseExited(MouseEvent e) {
		    	//JOptionPane.showMessageDialog(null, "Mouse is pressed" , "Temperature converter", JOptionPane.ERROR_MESSAGE); 
				
		    }

		    public void mouseClicked(MouseEvent e) {
		    	JOptionPane.showMessageDialog(null, "Mouse is clicked" , "Temperature converter", JOptionPane.PLAIN_MESSAGE); 
				
		    }
	}
}