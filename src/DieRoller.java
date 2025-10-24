import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        int d1 = 1;
        int d2 = 2;
        int d3 = 3;
        int sum;
        int roll;
        String playAgain = "yes";


        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        while (playAgain.equalsIgnoreCase("Yes")) {
            System.out.printf("%-6s %-8s %-8s %-8s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("--------------------------------------");
            for (roll = 0;!(d1 == d2 && d2 == d3); roll++) {
                d1 = rnd.nextInt(6) + 1;
                d2 = rnd.nextInt(6) + 1;
                d3 = rnd.nextInt(6) + 1;
                sum = d1 + d2 + d3;
                System.out.printf("%-6d %-8d %-8d %-8d %-5d%n", roll, d1, d2, d3, sum);
            }
            System.out.println("Would you like to play again yes or no");
            playAgain = in.nextLine();

            d1 = 1;
            d2 = 2;
            d3 = 3;
        }
    }
}

