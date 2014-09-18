package NeilHanlon.COMP285.Vending;

import java.util.*;


public class Vending
{

        public static void main(String[] args)
        {
                int change;
                Scanner key = new Scanner(System.in);
                Map<int,int> coins = new HashMap<Integer,Integer>();
                coins[50]; coins[25]; coins[10]; coins[5]; coins[1];

                System.out.println("Enter any whole number between 1 and 99");
                do
                {
                        change = key.nextInt();
                        if (change < 1 || change > 99)
                                System.err.println("Number must be between 1 and 99");
                } while (change > 0 && change < 100);

                

        }
}