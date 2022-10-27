import java.util.Scanner;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) throws Exception {
        String s1 = "Enter number of students: ";
        String s2 = "Enter student grades: ";

        double[] numbers = getNumsFromUser(s1, s2);

        System.out.println(Arrays.toString(numbers));
    }

    public static double[] getNumsFromUser(String msg1, String msg2) {
        // Asks the user for a number of elements using msg1, then asks the user for that many numbers using msg2
        Scanner sc = new Scanner(System.in);

        System.out.println(msg1);
        int num1 = sc.nextInt();

        double[] nums = new double[num1];

        System.out.println(msg2);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }

        sc.close();

        return nums;
    }
}
