//Himan Patel
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.*;

//Server Program
public class Server {
	public static void main(String[] args) throws IOException {
		//ip address
		int clientNum = 0;
		//create a socket listener
		ServerSocket listener = new ServerSocket(9898);
		try{
			while(true){
				new Capitalize(listener.accept(), clientNum++).start();
			}
		}finally{
			//close the listener
			listener.close();
		}
	}

	private static class Capitalize extends Thread{
		private Socket socket;
		private int clientNum;
	
		public Capitalize(Socket socket, int clientNum){
			this.socket = socket;
			this.clientNum = clientNum;
			//Print out these statements when the server is ready and has a connection with the client
			System.out.println("server: got connection from client x.x.x.x");
			System.out.println("Server is ready...");
		}
		
		public void run() {
			try{
				//create a buffered reader for the input
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//have a print writer object for the output
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				
				//print these out to be all capitalized
				out.println("Hello.");
				out.println("Nice to meet you!");
				
				while(true){
					//get the string from the server
					String string = reader.readLine();
					//if the string is null or comes accross a "." or "!", then break
					if(string == null || string.equals(".") || string.equals("!")){
						break;
					}
					//print the output to be the uppercase of the string "string"
					out.println(string.toUpperCase());
				}
			} catch (IOException e){
				//if there is a command that is not known, print this statement
				System.out.println("400 Command not valid");
			} finally {
				try{
					//close the socket
					socket.close();
				} catch (IOException e) {
					//print this statement if socket could not be closed
					System.out.println("Error closing socket");
				}
				//print out this statement if the socket is closed
				System.out.println("Connection closed");
			}
		}
	}

	public Writer getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getIntputStream() {
		// TODO Auto-generated method stub
		return null;
	}
}
