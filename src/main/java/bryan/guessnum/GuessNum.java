/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.guessnum;

/**
 *
 * @author EL GUARDIAN
 */


import java.util.Random;
import java.util.Scanner;

public class GuessNum {

  public static void main(String[] args) {
     
      Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1;
            int guess;
       
            
            System.out.print("Guess a number between 1 and 1000: \n");
            
            do {
                guess = scanner.nextInt();
                
                
                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                }
            } while (guess != numberToGuess);
            
            System.out.println("Congratulations. You guessed the number!\n");
            
            System.out.println("Do you want to play again? (y/n)");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("y");
        }
        
        System.out.println("Thanks for playing!");
    }
}


