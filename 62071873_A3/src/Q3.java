import java.util.Scanner;

public class Q3 {
    // Find the sum of all the digits of a integer between 0 and 999
    public static void main(String[] args) throws Exception{
        // Opens scanner
        Scanner scn = new Scanner(System.in);

        // Promts user for a number
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        // Closes scanner
        scn.close();

        // Calculates and prints sum of digits
        int sum = sumDigits(num);
        System.out.println("Sum of digits: " + sum);

    }

    static int sumDigits(int num){
        // Checks if number is within valid range
        if(num < 0 || num > 999){
            throw new ArithmeticException("Invalid number - Must be between 0 and 999");
        }

        // Create sum variable
        int sum = 0;

        // Calculates sum of digits
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
        
    }
}
