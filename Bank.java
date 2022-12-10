//Creating conditional statements : Approving customers for a loan if they,
// Having at least 10,000 in their savings account,
// Having less than 5,000 in credit card debt and Have worked for more than 2 years.

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Welcome to SBI BANK");
        System.out.println("Are you here for seeking debt? (please tyoe yes or no)");
        String decision = scan.nextLine();
        if (decision.equals("yes")) {
            System.out.println("\n Great! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int numYears = scan.nextInt();
            scan.nextLine();
            System.out.println("What is your name?");
            String name = scan.nextLine();
            if (savings >= 10000 && debt < 5000 && numYears > 2) {
                System.out.println("Congratulations " + name + " you have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage");
            }

        } else {
            System.out.println("\nOK. Have a nice day!");
        }
        scan.close();
    }
}
