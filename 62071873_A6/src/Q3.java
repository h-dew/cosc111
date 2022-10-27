import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        // Asks the user to input an integer and provides feedback on whether the integer is a palindrome or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        sc.close();

        if(isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Takes in an integer and reverses it
    public static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    // Takes in an integer and returns true if it is a palindrome
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
