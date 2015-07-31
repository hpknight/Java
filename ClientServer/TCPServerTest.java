// TCPServerTest.java
// Test the TCPServerGUI application.  GUI Version
import javax.swing.JFrame;

public class TCPServerTest
{
   public static void main( String args[] )
   {
      serverExample application = new serverExample(); // create server
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.runServer(); // run server application
   } // end main
} // end class TCPServerTest
