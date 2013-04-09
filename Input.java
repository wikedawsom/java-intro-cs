/**
 * Made by Christian Harris
 * Program that accepts input from
 * the command prompt and outputs a message.
 */

import java.io.*;

class Input
{
  public static void main(String[] args)
  {
    String name = "";
    String bDay = "";
    String age = "";
    boolean errorsFound = false;
    boolean exit = false;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(exit == false){
      System.out.println("\n\nPlease enter your name.\n");
      try{
         name = br.readLine();
      }catch(IOException IOE){
         name = "Couldn't read name.";
         errorsFound = true;
      }

      System.out.println("\nPlease enter your birth date.\n");
      try{
         bDay = br.readLine();
      }catch(IOException IOE){
         bDay = "Couldn't read birth date.";
         errorsFound = true;
      }

      System.out.println("\nPlease enter your age.\n");
      try{
         age = br.readLine();
      }catch(IOException IOE){
         age = "Couldn't read age.";
         errorsFound = true;
      }
    
      //this needs to be last
      if(errorsFound == true){
        System.out.println("Errors were found");
      }else{
        System.out.println("\nHello " + name + "\n");
        System.out.println("Your birthday is " + bDay + "\n");
        System.out.println("And you are " + age + " years old.\n");
      }
      System.out.println("Continue? yes/no");
      try{
        age = br.readLine();
      }catch(IOException IOE){
        age = "Couldn't read age.";
        errorsFound = true;
      }
      if(age.equals("no")){
       exit = true;
      }
    }
  }
}
