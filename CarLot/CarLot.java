/*
 *
 *
 *
 *
 */

import java.util.Scanner;

public class CarLot
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String make, model;
		System.out.print("How many cars are in your lot? ");
		int x = keyboard.nextInt();
		Car [] Cars = new Car [x];

		for (x = 0; x < Cars.length; x++)
		{
			System.out.print("What is the make of car number "+ (x+1) +"?");
			make = keyboard.nextLine();
			System.out.print("What year was you car made? ");
			model = keyboard.nextLine();

		}
	}
}