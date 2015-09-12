import javax.swing.JFrame; // this will give you basci windows features

public class JFrameExampleDemo {
	
	public static void main(String[] args) {
		JFrameExample myJFrame = new JFrameExample(); 
		
		myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how we want our program to close. 
		
		myJFrame.setSize(325,  200); 
		
		myJFrame.setVisible(true); 
	}
	
	

	
	

}