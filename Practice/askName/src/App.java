import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scn = new Scanner(System.in);
        System.out.println("How many seconds?");
        int seconds = scn.nextInt();
        scn.close();
        System.out.println(seconds / 60 + " minutes and " + seconds % 60 + "seconds");
    }
}
