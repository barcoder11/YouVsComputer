import java.util.Random;
import java.util.Scanner;

/**
 * guess the random generated number
 */

public class Guess {
    public static void main(String [] args) {
        guessGame();
    }

    public static void guessGame() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
       
        int rand = random.nextInt(100)+1;//range
        
        int track = 0; // tracks the amount of tries
        while(true) { //whileloop
        System.out.println("guess a number from 1 - 100");
        int guess = scan.nextInt();
        track++; // track tries
        if (guess > rand) {
            System.out.println("Guess is too high");
        }
        else if (guess < rand) {
            System.out.println("Guess is too low ");
        }
        else  {
            System.out.println("Correct guess");
            System.out.println("It took you " + track );
            break;} //end whileloop
        }
        scan.close();
    }
}