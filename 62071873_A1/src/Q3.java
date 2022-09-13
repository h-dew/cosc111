
public class Q3 {
	
	// calculates a distance traveled given and time in seconds and an acceleration in units per second squared
	public static void main(String[] args) {
		
		// time in seconds 
		int time = 12;
		
		// acceleration in units per second squared
		double acceleration = 9.81;
		
		double distance = ( (acceleration * (time * time) ) / 2);
		
		System.out.println("Distance after " + time + " seconds: " + distance);
	}
}
