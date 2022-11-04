import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Promts the user to input the length of three sides of a triangle
        // When the input is valid, the program will calculate the area of the triangle

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of three sides of a triangle:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Check if the input is valid
        while(!isValid(side1, side2, side3)) {
            System.out.println("Invalid input. Please try again.");
            System.out.println("Enter the length of three sides of a triangle:");
            side1 = sc.nextDouble();
            side2 = sc.nextDouble();
            side3 = sc.nextDouble();
        }
        sc.close();

        // Calculate the area of the triangle
        System.out.println("The area of the triangle is " + area(side1, side2, side3));
    }

    // Returns true if the sum of every two sides is greater than the third
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }

    // Return the triangle area
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}