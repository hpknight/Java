/*Himan Patel
 *2/03/2013
 *COP3330 - 0001
 *Assignment 2a
 *This program will calculate the human-perceived equivalent temperature when 
 *the actual air temperature is combined with the relative humidity.
 */

//Need to import this for user input
import java.util.Scanner;

//Class
public class HeatIndexCalculator {
	//The fields for this class. In order to calculate the heat index, all of these variables
	private int temperature;
	private double humidity;
	private double heatindex;
	
	//These values are constants; they will not change
	final double c1 = -42.379;
	final double c2 = 2.04901523;
	final double c3 = 10.14333127;
	final double c4 = -0.22475541;
	final double c5 = -6.83783E-3;
	final double c6 = -5.481717E-2;
	final double c7 = 1.22874E-3;
	final double c8 = 8.5282E-4;
	final double c9 = -1.99E-6;
	
	//Public constructor method
	public HeatIndexCalculator(int temperature, double humidity, double heatindex) {
		//Setting the variables to the default values
		temperature = 80;
		humidity = 40;
	}
	
	//Private method
	private double calculateHeatIndex (int currentTemp, double currentHumidity) {
		//This stores the user input to the variable in order to calculate the head index in the formula below
		temperature = currentTemp;
		humidity = currentHumidity;
		
		//This is the formula to calculate the heat index
		heatindex = c1 + (c2*temperature) + (c3*humidity) + (c4*temperature*humidity) + (c5*temperature*temperature) + (c6*humidity*humidity) + (c7*temperature*temperature*humidity) + (c8*temperature*humidity*humidity) + (c9*temperature*temperature*humidity*humidity);
		//Heat index is returned
		return heatindex;
	}
	
	//Private method
	private void printHeatIndex (int currentTemp, double currentHumidity, double calculateHeatIndex) {
		//This scanner will be used to scan in the values "currentTemp" and "currentHumidity" from the user
		Scanner input = new Scanner (System.in);
		
		//Print this statement and ask the user to enter the current temperature.
		//Store the user input in "currentTemp"
		System.out.println("Please enter the current temperature in degree Fahrenheit: ");
		currentTemp = input.nextInt();
		
		//Print this statement and ask the user to enter the current humidity.
		//Store the user input in "currentHumidity"
		System.out.println("Please enter the current humidity as a percentage: ");
		currentHumidity = input.nextDouble();
		
		//Print this to the screen stating the current temperature and current humidity
		System.out.println("At a temperature of " + currentTemp + "F and a humidity of " + currentHumidity + "percent. . . ");
		//Print what is actually feels like (from the head index calculated)
		System.out.println("It actually feels like: " + calculateHeatIndex + "F");
	}
}
