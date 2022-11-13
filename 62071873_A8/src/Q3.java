import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        int score = 0;

        String[][] provinceCaptial = {
                {"Alberta", "Edmonton"}
                , {"British Columbia", "Victoria"}
                , {"Manitoba", "Winnipeg"}
                , {"New Brunswick", "Fredericton"}
                , {"Newfoundland and Labrador", "St. John's"}
                , {"Nova Scotia", "Halifax"}
                , {"Ontario", "Toronto"}
                , {"Prince Edward Island", "Charlottetown"}
                , {"Quebec", "Quebec City"}
                , {"Saskatchewan", "Regina"}
        };   

        for(int i = 0; i < provinceCaptial.length; i++){
            if(askCapital(provinceCaptial ,i))
                score++;
        }

        System.out.println("You got " + score + " question(s) right.");
    }

    public static boolean askCapital(String[][] capitals, int num){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the capital of " + capitals[num][0] + "?");
        String answer = sc.nextLine();

        if(answer.equalsIgnoreCase(capitals[num][1])){
            return true;
        }
        else{
            return false;
        }

    }
}
