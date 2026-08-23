import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int score = 0;
        String choice;

        do {
            int num = r.nextInt(100) + 1;
            int attempts = 5;

            System.out.println("\nGuess a number from 1 to 100");
            System.out.println("You have " + attempts + " attempts");

            for (int i = 0; i < attempts; i++) {

                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == num) {
                    System.out.println("Correct!");
                    score++;
                    break;
                }

                if (guess < num) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }

                if (i == attempts - 1) {
                    System.out.println( "You couldn't guess the number");
                    System.out.println("The number was: " + num);
                }
            }

            System.out.println("Score: " + score);
            System.out.println("Do you want to play again? (yes/no):");
            choice = sc.next();

        } while (choice.equals("yes"));

        System.err.println("\nGame ended");
        System.err.println("Final score:" + score);

        sc.close();
    }
}