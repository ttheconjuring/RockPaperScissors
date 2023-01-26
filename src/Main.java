

import java.util.Scanner;

public class Main {

    public static void gameMenu() {
        System.out.println("1.Start Game");
        System.out.println("2.Exit Game");
    }

    public static void inGameMenu() {
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
    }

    public static void compare(int userChoice, int computerChoice) {
        if (userChoice == 1) {
            if (computerChoice == 1) {
                System.out.println("You: Rock");
                System.out.println("Computer: Rock");
                System.out.println("No winner");
            } else if (computerChoice == 2) {
                System.out.println("You: Rock");
                System.out.println("Computer: Paper");
                System.out.println("You lose");
            } else {
                System.out.println("You: Rock");
                System.out.println("Computer: Scissors");
                System.out.println("You win");
            }
        } else if (userChoice == 2) {
            if (computerChoice == 1) {
                System.out.println("You: Paper");
                System.out.println("Computer: Rock");
                System.out.println("You win");
            } else if (computerChoice == 2) {
                System.out.println("You: Paper");
                System.out.println("Computer: Paper");
                System.out.println("No winner");
            } else {
                System.out.println("You: Paper");
                System.out.println("Computer: Scissors");
                System.out.println("You lose");
            }
        } else {
            if (computerChoice == 1) {
                System.out.println("You: Scissors");
                System.out.println("Computer: Rock");
                System.out.println("You lose");
            } else if (computerChoice == 2) {
                System.out.println("You: Scissors");
                System.out.println("Computer: Paper");
                System.out.println("You win");
            } else {
                System.out.println("You: Scissors");
                System.out.println("Computer: Scissors");
                System.out.println("No winner");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        gameMenu();
        System.out.print("Please choose: ");
        int n = Integer.parseInt(sc.nextLine());
        // validating input
        while (n < 1 || n > 2) {
            System.out.print("Please choose: ");
            n = Integer.parseInt(sc.nextLine());
        }

        int userChoice;
        int computerChoice;

        while (n != 2) {
            inGameMenu();
            System.out.print("Please choose: ");
            userChoice = Integer.parseInt(sc.nextLine());
            // validating input
            while (userChoice < 1 || userChoice > 3) {
                System.out.print("Please choose: ");
                userChoice = Integer.parseInt(sc.nextLine());
            }
            computerChoice = (int) (Math.random() * 3 + 1);

            compare(userChoice, computerChoice);

            gameMenu();
            System.out.print("Please choose: ");
            n = Integer.parseInt(sc.nextLine());
            // validating input
            while (n < 1 || n > 2) {
                System.out.print("Please choose: ");
                n = Integer.parseInt(sc.nextLine());
            }
        }

        sc.close();
    }

}
