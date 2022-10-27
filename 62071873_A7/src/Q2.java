import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String s1 = "Enter number of students: ";
        String s2 = "Enter student grades: ";

        double[] numbers = getNumsFromUser(s1, s2);
        char[] letterGrades = showLetterGrades(numbers);

        for (int i = 0; i < letterGrades.length; i++) {
            System.out.println("Student " + i + " score is " + numbers[i] + " and grade is " + letterGrades[i]);
        }
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

    public static char[] showLetterGrades(double[] grades) {

        double best = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > best) {
                best = grades[i];
            }
        }

        char[] letterGrades = new char[grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= best - 10) {
                letterGrades[i] = 'A';
            } else if (grades[i] >= best - 20) {
                letterGrades[i] = 'B';
            } else if (grades[i] >= best - 30) {
                letterGrades[i] = 'C';
            } else if (grades[i] >= best - 40) {
                letterGrades[i] = 'D';
            } else {
                letterGrades[i] = 'F';
            }
        }

        return letterGrades;
    }
}
