//package com.neilhanlon.comp285.Homework.Three;

public class eight
{
	public static void main(String[] args)
	{
		double[] test1 = {1,2,3,4,5,6,7,8,9,10};
		double[] test2 = {1,2,2,3,4,5,6,7};
		double[] test3 = {1,2,3,2,3,4,5,6,6};
		double[] test4 = {9,8,7,6,5,4,3,2,1};
		double[] test5 = {-1,2,3,4,6,7};

		System.out.println(isStrictlyIncreasing(test1));
		System.out.println(isStrictlyIncreasing(test2));
		System.out.println(isStrictlyIncreasing(test3));
		System.out.println(isStrictlyIncreasing(test4));
		System.out.println(isStrictlyIncreasing(test5));
	}
	public static boolean isStrictlyIncreasing(double[] input)
	{
		double previous = input[0] - 1;
		for(double in : input)
		{
			if(in <= previous)
				return false;
			previous = in;
		}
		return true;
	}
}