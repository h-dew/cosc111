import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) throws Exception {
        // Prompts user to input char and checks if it is a vowel
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = sc.next().charAt(0);

        sc.close();

        if (!Character.isLetter(ch)) {

            System.out.println("Invalid input");

        } else {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");

            } else {
                System.out.println("Consonant");

            }
        }
    }
}
