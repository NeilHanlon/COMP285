//package NeilHanlon.COMP285.Range;

import java.util.Scanner;

public class Range
{
  public Range()
  { 
  }
  public static void main(String args[])
  {
    int min, max;

    Scanner keyboard = new Scanner(System.in);

    System.out.println"Enter a minimum and maximum value");

    min = keyboard.nextInt();
    max = keyboard.nextInt();

    if (max < min)
    {
      int t = min;
      min = max;
      max = t;
    }

    System.out.println("The number of values in the range from " + min + " to " + max + " is " + (max-min+1));
  }
}
