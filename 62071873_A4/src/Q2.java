import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        // Checks if plate number is valid
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid plate number: ");
        String plate = sc.nextLine();

        sc.close();

        if (plate.length() != 5) {
            System.out.println(plate + " is a valid plate number");
        } else {
            if(isChar(plate.charAt(0)) && isChar(plate.charAt(1)) && plate.contains("-") && isNum(plate.charAt(3)) && isNum(plate.charAt(4))){
                System.out.println(plate + " is a valid plate number");

            } else {
                System.out.println(plate + "is an invalid plate number");

            }
        }
    }

    public static boolean isChar(char ch) {
            return Character.isLetter(ch);
        }

    public static boolean isNum(char ch) {
            return Character.isDigit(ch);
        }
}
