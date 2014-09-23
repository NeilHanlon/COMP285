import java.util.Scanner;
import java.util.InputMismatchException;

public class ChocolateCoupons
{
    public static void main(String[] args)
    {
        int chocolateBars = 0, dollars = 0, coupons = 0;

        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.print("How much money can you spend on chocolate bars? ");
            dollars = keyboard.nextInt();

            do
            {
                chocolateBars++;
                coupons++;
                if(coupons >= 6)
                {
                    coupons = coupons % 6;
                } else 
                {
                    dollars--;
                }
            } while (dollars > 0);
        } catch (InputMismatchException e)
        {
            System.err.println("Invalid input.");
            System.exit( 1 );
        }

        System.out.println("After redeeming coupons you would have " + coupons +
                           " leftover, and can purchase a total of "+
                           chocolateBars + " chocolate bars. You would have "+
                           dollars + " dollars leftover.");

    }
}