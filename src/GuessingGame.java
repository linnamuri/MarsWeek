import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        Scanner input = new Scanner(System.in);
        int guess = 0;
        int increment = 0;
        boolean correctGuess=false;
    //public void setCorrectGuess(boolean correctGuess) {
        System.out.println("Hello User,What is your name?");
        //Create a new String variable named name which is set equal to input.nextLine()
        String name = input.nextLine();
        //Print "Welcome name I'm thinking of a number between 1 and 100."
        System.out.println("Welcome" + name + "I am thinking of a number between 1 and 100");
        //Create a new random object by calling the Random constructor
        Random random = new Random();
        //Create an int named number and set it equal to rand.nextInt(100)
        //rand.nextInt(100) chooses the next number generated by rand from the limit of 1 to 100
        int number = random.nextInt(100);
        System.out.println("Try to guess my number");
        while (correctGuess == false) {
            increment++;
            try {
                guess = input.nextInt();
            } catch (Exception e) {
                String badInput = input.next(); //needed to progress past the bad input
                System.out.println("That's not an integer, try again");
                //Use continue to skip back to the beginning of the while loop
                continue;
            }
            //Use an if statement to see if the guess is greater than 100 or less than 1
            if (guess > 100 || guess < 1) {
                System.out.println("You're guess is out of range. Please try again.");
            }
//Use an else-if statement to check if the guess is greater than the number
            else if (guess > number) {
                //Print "You're guess is too high. Please try again."
                System.out.println("You're guess is too high. Please try again.");
            }

            //Use an else-if statement to check if the guess is less than the number
            else if (guess < number) {
                System.out.println("You're guess is too low. Please try again.");
            }

            //Use an else-if statement to check if the guess is equal to number
            else if (guess == number) {
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");
                correctGuess = true;
            }
        }

    }
}
