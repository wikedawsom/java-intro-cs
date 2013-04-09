/**
 *By Christian Harris
 *
 *Number guessing game.
 */

import java.io.*;
import java.util.Random;

class Guess{
  public static void main(String[] args){

    // declare all variables	  
    int guess = 0;
    int counter = 0;
    String guessString = "";
    boolean errors = false;
    boolean exit = false;
    Random generator = new Random();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //Generate a random number.
    int randomNumber = generator.nextInt(11);
    
    System.out.println("Welcome to the number guessing game.");
    System.out.println("Type 'quit' at any time to exit.\n");
    System.out.println("Try to guess the correct number");
    System.out.println("in the least amount of tries.\n");

    while(exit == false){
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Take a guess:\n");
        try{
           guessString = br.readLine().trim();
           if (guessString.equals("quit")){
              System.out.println("Thanks for playing.");
              System.exit(1);
           }else{
              try{
	          guess = Integer.parseInt(guessString);

              }
	      catch(NumberFormatException nfe) {
       	          errors = true;
              }
           }
        }
	catch(IOException ioe){
          errors = true;
        }
        if (errors == false){
           counter+=1;
           if (guess == randomNumber){
              System.out.println("\n\n######################");
              System.out.println("#                    #");
              System.out.println("#                    #");
              System.out.println("# **** Correct! **** #");
              System.out.println("#                    #");
              System.out.println("# You took " + counter + " guesses #");
              System.out.println("#                    #");
              System.out.println("#    ? ? ? ? ? ?     #");
              System.out.println("#   ? Continue  ?    #");
              System.out.println("#    ? ? ? ? ? ?     #");
              System.out.println("#                    #");
              System.out.println("######################\n\n");

              try{
                 guessString = br.readLine().trim();
                 if (guessString.equals ("yes")){
                    counter = 0;
                    errors = false;
                    randomNumber = generator.nextInt(11);
                 }else{
                    System.out.println("\n\n ***** Thanks for playing ***** \n\n");
                    System.exit(1);
                 }
              }catch(IOException ioe){
                 System.out.println("Invalid response");
                 System.exit(1);
              }

           }else{
              System.out.println("Incorrect");
              if (guess < randomNumber){
                 System.out.println("Guess a higher number");
              }else{
                 System.out.println("Try a lower number");
              }
           }
        }else{
           System.out.println("\nPlease enter numbers only");
           errors = false;
        }
      }
   }
}
