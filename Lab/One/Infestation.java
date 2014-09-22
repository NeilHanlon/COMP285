import java.util.Scanner;


public class Infestation
{
    static final double GROWTH_RATE = 0.95;
    static final double ONE_BUG_VOLUME = 0.002;
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int houseVolume, estimatedRoaches, countWeeks = 0;
        double newBugs = 0, newBugsVolume;

        System.out.print("Enter the total volume of your house in cubic feet: ");
        houseVolume = keyboard.nextInt();

        System.out.print("Enter the total estimated number of roaches in your house: ");
        estimatedRoaches = keyboard.nextInt();

        if(houseVolume <= 0){
            throw new IllegalArgumentException("House Volume must be positive.");
        }
        if(estimatedRoaches <= 0){
            throw new IllegalArgumentException("Roaches must be positive.");
        }

        while(ONE_BUG_VOLUME * (estimatedRoaches + newBugs) < houseVolume)
        {
            newBugs += GROWTH_RATE * (estimatedRoaches + newBugs);
            countWeeks++;
        }
        newBugsVolume = ONE_BUG_VOLUME * (estimatedRoaches + newBugs);
        System.out.println("After "+ countWeeks + " weeks, the house will have "
                           +newBugs+ " new roaches"+" which will \nfill a volume of"
                           +" "+newBugsVolume + "cubic feet");

    }
}