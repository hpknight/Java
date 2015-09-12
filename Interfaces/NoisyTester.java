/** This is javadoc style format
 *  
 * @author Arup Feb 20 , 2013
 *
 */

// I didn't put comments in each and every line. 
// But you need to put comments (mandatory).
 
public class NoisyTester {
	
	public static void main( String[] args) {
		
//		Dog myDog = new Dog(); 
//		Car myCar = new Car(); 
//		Child myChild = new Child(); 
//		
//		myDog.makeNoise(); 
//		myCar.makeNoise();
//		myChild.makeNoise();
		
		
		Noisy myNoisy1 = new Dog(); 
		Noisy myNoisy2 = new Car(); 
		Noisy myNoisy3 = new Child(); 
		
		myNoisy1.makeNoise();
		
		myNoisy2.makeNoise();
		
		myNoisy3.makeNoise();
		
		Noisy[] noisyArray = new Noisy[] {new Dog(), new Car(), new Child()}; 

		for (int i = 0; i < noisyArray.length; i++)
		{
			noisyArray[i].makeNoise();
		}
		
	}

}