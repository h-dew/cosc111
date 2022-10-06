import java.util.Scanner;

public class Q2 {
    // Shows the decimal and integer value of a number
    public static void main(String[] args) throws Exception {
        // Opens scanner
        Scanner scn = new Scanner(System.in);

        // Promts user for a number
        System.out.println("Enter a real number: ");
        double num = scn.nextDouble();

        // Closes scanner
        scn.close();

        // Calculates and prints int value
        int numInt = (int) num;
        System.out.println("Integer part: " + numInt);

        // Calculates and prints fractional value
        double numFrac = num - numInt;
        System.out.println("Fraction part: " + numFrac);

    }
}
