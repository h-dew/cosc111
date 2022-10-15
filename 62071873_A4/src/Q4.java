import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        // Plays a game of rock paper scissors
        Scanner sc = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");

        int player = sc.nextInt();
        sc.close();

        String[] choices = {"scissor", "rock", "paper"};

        if(player < 0 || player > 2){
            System.out.println("Invalid input");
        } else {
            int computer = (int)Math.floor((Math.random() * 3));
            System.out.println("The computer is " + choices[computer] + ". You are " + choices[player]);

            if(player == computer){
                System.out.println("It is a draw");

            } else if(player == 0 && computer == 1){
                System.out.println("The computer won");

            } else if(player == 0 && computer == 2){
                System.out.println("You won");

            } else if(player == 1 && computer == 0){
                System.out.println("You won");

            } else if(player == 1 && computer == 2){
                System.out.println("The computer won");

            } else if(player == 2 && computer == 0){
                System.out.println("The computer won");

            } else if(player == 2 && computer == 1){
                System.out.println("You won");

            }
        }
    }
}
