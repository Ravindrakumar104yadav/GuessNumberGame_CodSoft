import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        do {
            int num = random.nextInt(100) + 1;
            int numOfTries = 0;
            boolean Guessed = false;

            System.out.println("Welcome to the Guess the Number game!");
            System.out.println("Guess a number between 1 and 100.");

            while (!Guessed) {
                System.out.print("Take a guess: ");
                int userGuess = sc.nextInt();
                

                if (userGuess < num) {
                    System.out.println("Too low. Try again.");
                } else if (userGuess > num) {
                    System.out.println("Too high. Try again.");
                }
                else if(numOfTries>6){
                    System.out.println("You crossed maximum number of tries!!!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + numOfTries + " tries.");
                    Guessed = true;
                }
                numOfTries++;

            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = sc.next();
            
            if (!playAgain.equals("y")||playAgain.equals("Y")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
        } while (true);

        
    }
}

