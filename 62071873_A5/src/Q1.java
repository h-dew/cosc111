import java.util.Scanner;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) throws Exception {
        // Promts the user to input as many numbers as they want until 0 is enetered.
        // Then it prints the total number of positive, negative, even and odd integers
        // that have been entered
        // Prints the sum and average of the input values (average should be rounded to
        // 2 decimal places)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer (0 to terminate)");
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(sc.nextInt());

        if (numList.get(0) == 0) {
            System.out.println("No numbers are entered except 0");

        } else {
            while (true) {
                System.out.println("Enter an integer (0 to terminate):");
                int num = sc.nextInt();

                if (num == 0) {
                    sc.close();
                    break;

                } else {
                    numList.add(num);
                }
            }
            sc.close();

            int positive = 0;
            int negative = 0;
            int even = 0;
            int odd = 0;
            int total = 0;

            for (int i = 0; i < numList.size(); i++) {
                int num = numList.get(i);
                if (num > 0) {
                    positive++;
                } else {
                    negative++;
                }

                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                total += num;
            }

            double average = Math.round(((double) total / numList.size()) * 100.0) / 100.0;

            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The number of evens is " + even);
            System.out.println("The number of odds is " + odd);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
    }
}