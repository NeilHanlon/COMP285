//package com.neilhanlon.comp285.Homework.Three

public class twenty
{
	public static void main(String[] args)
	{
		double[][] test1 = new double[5][5];

		for(int i = 0; i < 5; ++i)
		{
			for(int j = 0; j < 5; ++j)
			{
				test1[i][j] = i * j * 5;
			}
		}
		System.out.println("Before: ");
		printFigure(test1);
		System.out.println("After: ");
		double[][] newFig = findFigure(test1, .5);
		printFigure(newFig);
	}
	public static double[][] findFigure(double[][] picture, double threshold)
	{
		double[][] newFigure = new double[picture.length][];
		System.arraycopy(picture,0,newFigure,0,picture.length);

		double average = findAverage(picture);

		for(int row = 0; row < picture.length; ++row)
		{
			for(int col = 0; col < picture[row].length; ++col)
			{
				if(picture[row][col] > (average * threshold))
				{
					newFigure[row][col] = 1.0;
				}
				else
				{
					newFigure[row][col] = 0.0;
				}
			}
		}
		return newFigure;
	}
	public static void printFigure(double[][] arr)
	{
		for(double[] a: arr)
		{
			int maxlength = a.length;
			int i = 0;
			for(double b: a)
			{
				if(i == maxlength-1)
					System.out.println(b);
				else
					System.out.print(b+"\t");
				i++;
			}
		}
	}
	public static double findAverage(double[][] arr)
	{
		double total = 0;
		int count = 0;
		for(double[] a : arr)
		{
			for(double b : a)
			{
				total += b;
			}
			count++;
		}
		return total / (count*2);
	}
}