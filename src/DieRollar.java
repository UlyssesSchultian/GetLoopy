import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.printf("%-6s %-6s %-6s %-6s %-6s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 1;
            boolean tripleFound = false;

            while (!tripleFound) {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-6d %-6d %-6d %-6d %-6d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    tripleFound = true;
                } else {
                    rollCount++;
                }
            }

            System.out.print("\nRoll again? (y/n): ");
            String response = input.nextLine();
            keepPlaying = response.equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}