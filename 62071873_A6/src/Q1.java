import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in seconds:");
        System.out.println(convertTime(sc.nextInt()));

        sc.close();
    }

    public static String convertTime(int totalSeconds) {
        int hours = (int) totalSeconds / 3600;
        int minutes = (int) (totalSeconds - hours * 3600) / 60;
        int seconds = totalSeconds - minutes * 60 - hours * 3600;

        return (hours + ":" + minutes + ":" + seconds);
    }
}
