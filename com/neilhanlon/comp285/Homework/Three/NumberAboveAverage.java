//package com.neilhanlon.Homework.Three;

import java.util.Scanner;

public class NumberAboveAverage
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double[] temperatures = new double[10];
		System.out.print("Enter ten temperatures, each followed by a return: ");
		for(int i = 0; i < 10; ++i)
		{
			temperatures[i] = keyboard.nextInt();
		}
		double avg = average(temperatures);
		int daysAbove = findAboveAverage(temperatures,avg);

		System.out.println("The average temperatore was: "+avg+" Degrees.");
		System.out.print("There were " + daysAbove + " days on which the temperature was above average.");
	}
	public static double average(double[] numbers)
	{
		double total = 0;
		for(double num : numbers)
		{
			total += num;
		}
		return total / (double) numbers.length;
	}
	public static int findAboveAverage(double[] numbers, double average)
	{
		int count = 0;
		for(double num : numbers)
		{
			if(num > average)
			{
				count++;
			}
		}
		return count;
	}
}