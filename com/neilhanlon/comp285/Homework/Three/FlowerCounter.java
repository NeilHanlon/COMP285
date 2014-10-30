//package com.neilhanlon.comp285.Homework.Three;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Set;
import java.text.DecimalFormat;

public class FlowerCounter
{

	private static final String[] flowerNames = {"petunia", "pansy", "rose", "violet", "carnation"};
	private static final double[] flowerPrices =   { 0.50,      0.75,    1.50,   0.50,     0.80};
	private static final String DBL_FORMAT = "#0.00";
	private static DecimalFormat df = new DecimalFormat(DBL_FORMAT);

	public static void main(String[] args)
	{

		String flower;
		int quantity;

		try(Scanner keyboard = new Scanner(System.in))
		{
			System.out.println("Welcome to the flower store. We have the following flowers in stock: ");
			System.out.println("Petunia, Pansy, Rose, Violet, Carnation");
			System.out.print("Which flower would you like to buy? ");
			flower = keyboard.next();
			System.out.print("How many "+ flower +"s would you like to buy? ");
			quantity = keyboard.nextInt();

			double total = getTotal(flower,quantity);

			System.out.println("The total for "+ quantity + " " + flower + "(s) is $" + df.format(total));
		} catch (InputMismatchException e)
		{
			System.err.println("Fatal error: Invalid input.");
			System.exit(1);
		}
	}
	public static double getTotal(String flower, int quantity)
	{
		return flowerPrices[getIndex(flowerNames,flower)] * quantity;
	}
	public static int getIndex(String[] arr, String target)
	{
		int index = 0;
		for(String next : arr)
		{
			if(next.equalsIgnoreCase(target))
			{
				return index;
			}
			index++;
		}
		return -1;
	}
}