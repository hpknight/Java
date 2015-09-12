import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadToHashmap {
    public static void main(String[] args) throws Exception {
    	try {
    		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Himan\\Documents\\Workspace\\JavaTest\\TextFiles\\vehicles.txt"));
    		
    		Map<String, String> vehicles = new LinkedHashMap<String, String>();
    		String vehicleText = "";
    		String[] values = null;
    		
    		while((vehicleText = br.readLine()) != null){
    			values = vehicleText.split("=");
    			String ID = values[0];
    			String vName = values[1];
    			
    			vehicles.put(ID, vName);
    		}
    		
    		/*
    		 * System.out.println("Map: " + vehicles);
    		 * Output:
    		 * Map: {1=Ducati Monster 1100, 2=Hennessey Venom GT2, 3=Tesla Model S, 4=Ferrari Enzo, 5=Jenson Diamondback Sortie 29Er Mountain Bike, 6=MTD-800 Go-Kart, 7=Fort Pinto Hatchback, 8=Lamborghini Veneno Roadster, 9=Aston Martin Vanquish Q, 10=Hoveround Dart 3-Wheel Travel Scooter}
    		 */
    		
    		System.out.println("\nValues of map after iterating over it : ");
    		for (String key : vehicles.keySet()) {
    			System.out.println(key + ":\t" + vehicles.get(key));
    		}
    		
    		/*
    		 * System.out.println("\nThe current vehicle of ID 10 is : " + vehicles.get("10"));
    		 * Output:
    		 * The current vehicle of ID 10 is : Hoveround Dart 3-Wheel Travel Scooter
    		 */

    	} catch (Exception e){
    		e.printStackTrace();
    	} 
    }
}