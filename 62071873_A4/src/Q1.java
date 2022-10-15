import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) throws Exception {
        // Prompts user to input char and checks if it is a vowel
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");

        char ch = sc.next().charAt(0);

        sc.close();

        if (!Character.isLetter(ch)) {

            System.out.println(ch + " is an invalid input");

        } else {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");

            } else {
                System.out.println(ch + " is a consonant");

            }
        }
    }
}
