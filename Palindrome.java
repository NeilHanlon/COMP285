import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Palindrome
{
    long number;

    Palindrome(long input)
    {
        number = input; 
    }

    public static void main(String[] args)
    {
        long input;
        try(Scanner keyboard = new Scanner(System.in))
        {
            input = keyboard.nextLong();

            Palindrome input1 = new Palindrome(input);

            if(input1.isPalindrome())
            {
                System.out.println(String.valueOf(input)+" is a palindrome");
            } else 
            {
                System.out.println(String.valueOf(input)+" is not a palindrome");
            }
        } catch (InputMismatchException e)
        {
            System.err.println("Invalid Input. Expected integer, non-integer received");
            System.exit( 1 );
        }

    }
    private boolean isPalindrome(){
        String num = Long.toString(this.number);
        String reverse = new StringBuilder(num).reverse().toString();
        if(num.equals(reverse))
        {
            return true;
        }
        return false;
    }

}