// TCPClientTest.java
// Test the TCPClientGUI class. GUI Version
import javax.swing.JFrame;

public class TCPClientTest 
{
   public static void main( String args[] )
   {
	   clientExample application; // declare client application

      // if no command line args
      if ( args.length == 0 )
         application = new clientExample( "127.0.0.1" ); // connect to localhost
      else
         application = new clientExample( args[ 0 ] ); // use args to connect

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.runClient(); // run client application
   } // end main
} // end class TCPClientTest

