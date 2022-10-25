import java.util.Scanner;
import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args){
        // Promts the user to enter a number of students then ask for a name and score for every student.
        // Prints the names and scores of the top two students
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        // Not sure why I used ArrayList, but works anyways :p
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> scores = new ArrayList<Double>();

        for (int i = 0; i < numStudents; i++){
            System.out.println("Enter a student name: ");
            sc.nextLine(); // Without this, the following method is not invoked, not sure why
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter a student score: ");
            double score = sc.nextDouble();
            scores.add(score);
        }

        sc.close();

        // Find the top two scores
        double max = scores.get(0);
        int maxIndex = 0;
        for (int i = 1; i < scores.size(); i++){
            if (scores.get(i) > max){
                max = scores.get(i);
                maxIndex = i;
            }
        }

        double max2 = scores.get(0);
        int max2Index = 0;
        for (int i = 1; i < scores.size(); i++){
            if (scores.get(i) > max2 && scores.get(i) != max){
                max2 = scores.get(i);
                max2Index = i;
            }
        }

        // Print the top 2 names and scores
        System.out.println(names.get(maxIndex) + "'s score is: " + scores.get(maxIndex));
        System.out.println(names.get(max2Index) + "'s score is: " + scores.get(max2Index));
    }
}
