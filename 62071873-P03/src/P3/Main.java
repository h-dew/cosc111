package P3;

/* This file includes:
 * 	1. Solution to P2
 *  2. Questions for P3. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have from 1 to 3 players
 *  - We have exactly 3 questions, one question for each player
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- 1-D arrays
 *  - for loops
 * 
 * Aim:
 * 	- Reduce code redundancy by the use of arrays and for loops 
 */

public class Main {				
	static Game game;			
	public static void main(String[] args) {
		String ans;
		do{							//This is the beginning of the game loop	
			//Reset the game
			game = new Game();			
			
			//REQ1: Modify the code below to replace these 6 variables with two String arrays: questions, and answers, each having 3 elements. e.g. questions[0] replaces q0, answers[0] replaces a0, etc.
			String q0 = "What is commonly known as the first meal of the day";
			String a0 = "Breakfast";
			String q1 = "How many objects does a dozen represent (answer using letters)";
			String a1 = "Twelve";
			String q2 = "What element gives blood its colour";
			String a2 = "Iron";
			//END of REQ1
			
			//REQ2:	Add code to ask user about the number of players (from 1 to 3) - use game.askForInt. Store the input in a variable numPlayers.
			int numPlayers = game.askForInt("How many players are playing?",1,3);

			//REQ3:	Modify the code below to ask for players' names and add them to the game in a for loop (up to numPlayers iterations).
			for(int i = 0; i < numPlayers; i++){
				String name = game.askForText("What is player 0 name?");
				game.addPlayer(name);
			}
			//END of REQ3
			
			//REQ4:	Modify this part to ask questions and get answers in a for loop (up to numPlayers iterations)  
			for(int i = 0; i < numPlayers; i++){
				game.setCurrentPlayer(i);

				String answer = game.askForText(q0);
				if(a0.equalsIgnoreCase(answer))
					game.correct();		//display "Correct", increment score, change frame color to green
				else
					game.incorrect();	//display "incorrect", change frame color of player to red
			}

			for(int i = 0; i < numPlayers; i++){
				game.setCurrentPlayer(i);

				String answer = game.askForText(q1);
				if(a1.equalsIgnoreCase(answer))
					game.correct();		//display "Correct", increment score, change frame color to green
				else
					game.incorrect();	//display "incorrect", change frame color of player to red
			}

			for(int i = 0; i < numPlayers; i++){
				game.setCurrentPlayer(i);

				String answer = game.askForText(q2);
				if(a2.equalsIgnoreCase(answer))
					game.correct();		//display "Correct", increment score, change frame color to green
				else
					game.incorrect();	//display "incorrect", change frame color of player to red
			}
			//END of REQ4
			
			//Do you want to play again? make sure you get valid input
			ans = game.askForText("Play again? (Y/N)"); 

			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = game.askForText("Invalid input. Play again? (Y/N)");
		}while(ans.toUpperCase().equals("Y"));	//play again if the user answers "Y" or "y"

		System.exit(1); 	//This statement terminates the program
		
	}
}
