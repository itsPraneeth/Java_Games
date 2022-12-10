//Creating a RockPaperScissors game

import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ready = scan.nextLine();
        //Task 1: Seeing if the user wants to play.

        //Task 2: Seting up the game

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");
            String yourChoice = scan.next();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("Darn, some other time...");
        }
        scan.close();
    }


    //Task 3  –function where the computer picks a random choice.

    /**
     *
     *   1. A random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int integer = (int) randomNumber;


        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";  //default case not possible.

        }

        // if (integer == 0) {
        //     return "rock";
        // } else if (integer == 1) {
        //     return "paper";
        // } else if (integer == 2) {
        //     return "scissors";
        // }


    }

    //Task 4  – A function that compares the choices and returns the result
    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }


    //Task 5  – A function that prints your choice, the computer's, and the result.
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + yourChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }
}
