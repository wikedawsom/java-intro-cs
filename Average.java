/**
 * Average by Christian
 * Produces an average 
 * from a series of numbers.
 */

import java.io.*;

class Average{
   public static void main(String[] args){
      
      //Declare Variables
      String input = "";
      int total = 0;
      int count = 0;
      int temp = 0;
      boolean exit = false;
      boolean badinput = false;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      //Intro statement
      System.out.println("--------------------------");
      System.out.println("  Enter a set of numbers");
      System.out.println("  and this program");
      System.out.println("  will find the average.");
      System.out.println("  Enter average when");
      System.out.println("  you are done entering");
      System.out.println("  numbers.");
      System.out.println("--------------------------");
      
      while(exit == false){
      
         System.out.println("\nEnter a number\n");
         try{
            input = br.readLine().trim();
            if(input.equals("average")){
               exit = true;
            }else{
               try{
                  temp = Integer.parseInt(input);
               }catch(NumberFormatException nfe){
                  badinput = true;
               }
            }
         }catch(IOException ioe){
            System.out.println("\nTry again");
         }
         if (badinput == false){
            total = total + temp;
            count+=1;
         }else{
            System.out.println("\nPlease re-enter");
            badinput = false;
         }
      }
      if (count == 0){
         System.out.println("Nothing to average");
      }else{
         System.out.println("\n\nAverage: " + total/count + "\n");
      }
   }
}