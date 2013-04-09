/**
 *  By Christian Harris
 *  Simple application that prints
 *  to the command prompt.
 */

import java.lang.*;

class HelloWorld{
  public static void main(String[] args){
    
    String mystring1 = "My name is Christian";
    String mystring2 = "My age is ";
    int int1 = 13;
    double double1 = 4000938271.887;
    boolean bool1 = true;
    boolean bool2 = false;

    System.out.println("\nHey :D");
    System.out.println("\n" + mystring1);
    System.out.println("\n" + mystring2 + int1);
    System.out.println("\n" + double1 / int1);
    System.out.println("\nbool1 = " + bool1);
    System.out.println("\nbool2 = " + bool2);

  }
}