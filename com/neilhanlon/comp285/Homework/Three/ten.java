//package com.neilhanlon.comp285.Homework.Three;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class ten
{
	public static void main(String[] args)
	{
		int[] test1 = {0,1,3,2,3,0,3,1};

		for(int out : test1)
		{
			System.out.println(out);
		}
		int[] result = remove(3,test1);
		System.out.println("NEW: " +result.length);
		for(int res : result)
		{
			System.out.println(res);
		}
	}
	public static int[] remove(int toRemove, int[] input)
	{
		int[] newList = new int[input.length];
		int count = 0;
		for(int i : input)
		{
			if(!(i == toRemove))
			{
				newList[count] = i;
				count++;
			}
		}
		return resize(newList,count);
	}
	public static int[] resize(int[] arr, int newSize)
	{
		int[] newList = new int[newSize];
		for(int i = 0; i < newSize; ++i)
		{
			newList[i] = arr[i];
		}
		return newList;
	}
}