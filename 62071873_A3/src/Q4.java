import java.util.Scanner;
public class Q4 {
    // Performs several calculations on a number
    public static void main(String[] args) throws Exception {
        // Opens scanner
        Scanner scn = new Scanner(System.in);

        // Promts user for a number
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        // Closes scanner
        scn.close();

        // Performs operations on number
        num = messItUp(num);

        //Prints result
        System.out.println("Result: " + num);

    }

    static int messItUp(int num){

        // Augmented assignment operators
        num += 5;
        num /= 2;

        // Increment and decrement operators
        num++;
        --num;

        // Arithmetic Operators
        // Had to use explicit typecasting to keep the number an integer
        num = (int) (num * 3.1415);
        num = num + 2;

        // Math methods
        num = Math.abs(num);
        // Had to use explicit typecasting in order to keep the number an integer
        num = (int) Math.sqrt(num);
        
        // Returns number
        return num;
    }
}
