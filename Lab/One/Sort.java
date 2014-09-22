/*
* Sort.java
* @Author hanlonn@wit.edu
* @Author willardm@wit.edu
* @Date 9/22/2014
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.InputMismatchException;

public class Sort
{
    public static void main(String[] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            ArrayList input = new ArrayList<>();
            int nextInt = 0;

            do
            {
                System.out.print("Enter a positive integer, or -1 to quit: ");
                nextInt = keyboard.nextInt();
                if(nextInt > 0) 
                    input.add(nextInt);
            } while(nextInt > 0);

            Collections.sort(input);

            double total = 0, average;

            for (Iterator i = input.iterator();i.hasNext();)
            {
                total += (int) i.next();
            }
            
            average = total / (double) input.size();

            System.out.println("Smallest: " + input.get(0));
            System.out.println("Largest: " + input.get(input.size() - 1));
            System.out.println("Average: "+ average);

        } catch (InputMismatchException e)
        {
            System.err.println("Input must be a whole number.");
            System.exit( 1 );
        }
    }
}