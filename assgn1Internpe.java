import java.util.*;
import java.util.Random;

public class assgn1Internpe {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        while (play.equals("yes")) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while (guess != randNum) {
                System.out.print("Guess a number between 1 to 100:");
                guess = reader.nextInt();
                tries++;

                if (guess == randNum) {
                    System.out.print("Awesome! you guessed the number");
                    System.out.print("It only took you" + tries + "guesses!");
                    System.out.print("Would you like to play agian? Yes or not");
                    play = reader.next().toLowerCase();
                } else if (guess > randNum) {
                    System.out.print("Your guess is too high. try again!");
                } else
                    System.out.print("Your guess is too low. try again!");
            }
        }

    }
}
