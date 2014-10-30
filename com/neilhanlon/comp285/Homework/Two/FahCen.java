import java.util.Scanner;

public class FahCen
{
    public static void main(String[] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            float fahrenheit;
            float celsius;

            System.out.print("Enter a temperature in Fahrenheit: ");
            fahrenheit = keyboard.nextFloat();

            celsius = (5 * (fahrenheit - 32))/(float)9;

            System.out.println(fahrenheit + " degrees Fahrenheit is "+celsius+" degrees Celsius");


        }
    }
}