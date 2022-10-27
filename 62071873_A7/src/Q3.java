import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        String msg1 = "How many numbers in the list?";
        String msg2 = "Enter the list:";

        double[] list = getNumsFromUser(msg1, msg2);

        boolean isSorted = isSorted(list);

        if (isSorted)
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");

    }

    public static boolean isSorted(double[] list) {
        boolean isSorted = true;

        for (int i = 1; i < list.length; i++) {
            if (list[i - 1] > list[i])
                isSorted = false;
        }

        return isSorted;
    }

    public static double[] getNumsFromUser(String msg1, String msg2) {
        // Asks the user for a number of elements using msg1, then asks the user for
        // that many numbers using msg2
        Scanner sc = new Scanner(System.in);

        System.out.println(msg1);
        int num1 = sc.nextInt();

        double[] nums = new double[num1];

        System.out.println(msg2);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }

        sc.close();

        return nums;
    }
}
