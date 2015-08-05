import java.io.*;
import java.net.*;


//client program
public class Client {

    private BufferedReader reader;
    private PrintWriter writer;
    
   
    public void connectToServer() throws IOException {

        String serverAddress = null;
		// Make connection and initialize streams
        Socket socket = new Socket(serverAddress, 9898);
        //create a new buffered reader and print writer
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);

    }

    //runs client program
    public static void main(String[] args) throws Exception {
    	//create a client object
        Client client = new Client();
        client.connectToServer();
    }
}