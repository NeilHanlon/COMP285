import java.util.*;

public class FromBinary
{
    /**
    @TODO Add test for non-binary numbers (regex for only 0's and ones)
    **/
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String input;
        String[] inputChar = new String[4];
        int total = 0, b1,b2,b3,b4;

        System.out.print("Input a four-bit binary number: ");
        input = keyboard.next();

        for (int i = 0; i < input.length(); ++i)
        {   
            try
            {
                inputChar[i] = Character.toString(input.charAt(i));
            } catch (ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Binary string is longer than a nibble");
                System.exit( 2 );
            }
        }

        try
        {
            b1 = Integer.parseInt(inputChar[3]);
            b2 = Integer.parseInt(inputChar[2]);
            b3 = Integer.parseInt(inputChar[1]);
            b4 = Integer.parseInt(inputChar[0]);

            total = 8 * b4 + 4 * b3 + 2 * b2 + 1 * b1;
        } catch (NumberFormatException e)
        {
            System.err.println("Invalid format.");
            System.exit( 1 );
        }

        System.out.println(input + " in Decimal is " + Integer.toString(total));

    }
}