import java.util.Scanner;

public class decisionMaking {

    public static void main(String[] args) {
        // conditional statements to automate the decision-making process.

        Scanner input = new Scanner(System.in);
        // gathers user input
        String output = "";
        String choice = "y";

        do {
            System.out.println("Enter an integer between 1-100");
            int num = input.nextInt();

            if (num % 2 == 1) {
                output = num + " and odd";
            }
            // if integer is odd, print number entered and odd.
            else if (num % 2 == 1 && num > 60) {
                output = num + " Odd and over 60.";
            }
            // if integer entered is odd and over and over sixty.
            else if (num >= 2 && num < 25) {
                output = "Even and less than 25.";
            }
            // if integer entered falls in between 2 & 25
            else if (num >= 26 && num <= 60) {
                output = "Even.";
            }
            // if integer integer entered is even and falls between 26 & 60.
            else {
                output = num + " and Even.";
            }
            // else the integer entered is even and greater than 60.

            System.out.println(output);
            System.out.println("Do you wish to continue? (y/n)");
            choice = input.next();
        } while (!choice.equalsIgnoreCase("n"));
        System.out.println("See ya next time!");
    }

}