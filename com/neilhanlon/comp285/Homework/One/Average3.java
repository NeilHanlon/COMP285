//package NeilHanlon.COMP285.Average3;

import java.util.Scanner;

public class Average3
{

    public static void main(String[] args)
    {

        String[] labels = {"first","second","third"};
        double total = 0;
        int[] inputs = {0,0,0};

        Scanner keyboard = new Scanner(System.in);

        for(int i=0;i<3;++i){
            System.out.print("Enter the "+labels[i]+" integer: ");
            inputs[i] = keyboard.nextInt();
            total += inputs[i];
        }
        System.out.println("The average of "+inputs[0]+", "+inputs[1]+
                           ", and "+ inputs[2]+ " is " +(total/3));

    }

}