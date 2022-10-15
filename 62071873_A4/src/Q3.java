import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        // Valides a the perimeter of a triangle given 3 lengths
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 edges (length in double)");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The perimeter is " + (a + b + c));
        } else {
            System.out.println("Input is invalid");
        }
    }
}
