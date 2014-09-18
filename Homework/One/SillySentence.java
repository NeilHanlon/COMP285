import java.util.Scanner;
import java.util.*;

public class SillySentence
{
    public static void main(String[] args)
    {
        Map<String,String> input = new HashMap<String,String>();
        Scanner keyboard = new Scanner(System.in);

        input.put("color","");
        input.put("name","");
        input.put("animal","");
        input.put("food","");

        for (String key : input.keySet())
        {
            String inputString;
            System.out.print("Enter your favorite "+key+": ");
            inputString = keyboard.next();
            input.put(key,inputString);
        }

        System.out.println("I had a dream that "+input.get("name")
                           +" ate a " + input.get("color") + " "
                           + input.get("animal") + " and said it "
                           + "tasted like " + input.get("food") + "!");
        System.exit(0);
    }
}