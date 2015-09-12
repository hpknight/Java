import java.awt.FlowLayout; // default layout management  
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class JFrameExample extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	private JLabel label1; 
	private JFrame frame;
	
	private JFrameExample () {
		super("MY JFrame Example"); // can take only title
		
		setLayout(new FlowLayout()); //default layout

		label1 = new JLabel("This is the University of Central Florida."); 
		
		label1.setToolTipText("We are in COP 3330 class.");//The text displays when the cursor lingers over the component. 
		
		//add(label1); // adding item in the window
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how we want our program to close. 
		
		frame.setSize(325,  200); 
		
		frame.setVisible(true); 
		
	}
	
	//public class JFrameExampleDemo {
		
		public static void main(String[] args) {
			new JFrameExample();
			
		}
		

}