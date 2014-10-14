import java.util.Scanner;

public class Chpt2
{
    public static void main(String[] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            float x;
            int y;
            byte z;

            System.out.print("Input a floating point value: ");
            x = keyboard.nextFloat();

            y = (int) x;
            z = (byte) x;

            System.out.println("X: "+x);
            System.out.println("Y: "+y);
            System.out.println("Z: "+z);
        }
    }
}