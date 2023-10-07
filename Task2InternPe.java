import java.util.*;

public class Task2InternPe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choice = { "Rock", "Paper", "Scissor" };

        while (true) {
            System.out.print("Rock, Paper, or Scissor? Enter your choice :");
            String playerchoice = sc.nextLine();
            int playerIndex = -1;

            for (int i = 0; i < choice.length; i++) {
                if (choice[i].equalsIgnoreCase(playerchoice)) {
                    playerIndex = i;
                    break;
                }
            }
            if (playerIndex == -1) {
                System.out.print("Invalid choice. Please choose Rock,Paper or Scissor.");
                continue;
            }
            int autoIndex = random.nextInt(3);
            String autochoice = choice[autoIndex];

            System.out.print("\n" + "Player chose: " + playerchoice);
            System.out.print("\n" + "Auto chose: " + autochoice);

            if (playerIndex == autoIndex) {
                System.out.println("\n" + "It's a tie!");
            } else if ((playerIndex == 0 && autoIndex == 2) ||
                    (playerIndex == 2 && autoIndex == 1) ||
                    (playerIndex == 1 && autoIndex == 0)) {
                System.out.println("\n" + "Player wins");
            } else {
                System.out.print("\n" + "Compuer wins!");
            }
            System.out.print("\n" + "Do you want to play again? (Yes/no)");
            String playAgain = sc.nextLine().toLowerCase();
            if (!playAgain.equals("no")) {
                continue;
            } else {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }
        sc.close();
    }

}
