/*Himan Patel
 *2/04/2013
 *COP3330 - 0001
 *Assignment 2b
 *This program will test the calculator of the human-perceived equivalent temperature when 
 *the actual air temperature is combined with the relative humidity.
 */

//Public class
public class HeatIndexCalculatorTester {
	//Main
	public static void main(String[] args) {
		//Calls HeatIndexCalculator (the constructor)
		HeatIndexCalculator test = new HeatIndexCalculator(int temperature, double humidity, double heatindex);
		//Print out the output from the class HeatIndexCalculator
		System.out.println(test.printHeatIndex(temperature, humidity, heatindex));
	}
}