//package com.neilhanlon.comp285.Homework.Three;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class nine
{
	public static void main(String[] args)
	{
		Character[] test1 = {'a','b','b','c','d','e','e','e','f','g','g','h','i'};

		for(Character out : test1)
		{
			System.out.println(out);
		}
		Character[] result = removeDuplicates(test1);
		System.out.println("NEW: " +result.length);
		for(Character res : result)
		{
			System.out.println(res);
		}
	}
	public static Character[] removeDuplicates(Character[] input)
	{
		Character[] newList = new Character[input.length];
		int i = 0;
		for(Character in : input)
		{
			if(!contains(newList,in))
			{
				newList[i] = in;
				i++;
			}
		}
		return resize(newList,i);
	}
	public static boolean contains(Character[] arr, Character target)
	{
		Set<Character> set = new HashSet<Character>(Arrays.asList(arr));
		return set.contains(target);
	}
	public static Character[] resize(Character[] arr, int newSize)
	{
		Character[] newList = new Character[newSize];
		for(int i = 0; i < newSize; ++i)
		{
			newList[i] = arr[i];
		}
		return newList;
	}
}