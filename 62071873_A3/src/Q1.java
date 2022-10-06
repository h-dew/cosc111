import java.util.Scanner;

public class Q1 {
    // Calculates wind chill temperature
    public static void main(String[] args) throws Exception {
        
        // Initialize scanner
        Scanner scn = new Scanner(System.in);

        // Promt user for the temperature
        System.out.println("Enter the temperature in Farenheit between -58 F and 41F");
        int temp = scn.nextInt();

        // Checks if temperature is within valid range and gives error if not within range
        if(temp <= -58 || temp >= 41){
            scn.close();
            throw new ArithmeticException("Invalid temperature - Must be between -58 and 41");
        }

        // Promt user for wind speed
        System.out.println("Enter the wind speed in miles per hour (must be greater than or equal to 2)");
        int speed = scn.nextInt();

        // Checks if speed is within valid range and gives error if not within range
        if(speed < 2){
            scn.close();
            throw new ArithmeticException("Invalid speed - Must be greater than or equal to 2");
        }

        scn.close();

        // Calculates wind chill
        double windChill = toWindChill(speed, temp);
        System.out.println("The wind chill index is: " + windChill);
        
    }


    static double toWindChill(int speed, int temp){
        // Gives wind-chill given wind speed and temperature
        double windChill;
        windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

        return windChill;
    }
}

