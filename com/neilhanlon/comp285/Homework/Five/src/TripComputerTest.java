/**
 * Created by hanlonn on 11/25/2014.
 */
public class TripComputerTest {
    public static void main(String[] args)
    {
        TripComputer leg1 = new TripComputer(), leg2 = new TripComputer(), leg3 = new TripComputer();
        try {
            //leg1
            System.out.printf("Traveled for: %.2f hours.\n",leg1.computeTimeTaken(300.0, 65.0));
            System.out.println(leg1.getTotalTime() + " minutes--before rest stop.");
            leg1.takeRestStop(10); //minutes
            System.out.println(leg1.getTotalTime() + " minutes--after rest stop.");

            //leg2

            System.out.printf("Traveled for: %.2f hours.\n",leg2.computeTimeTaken(500.0, 75.0));
            System.out.println(leg2.getTotalTime() + " minutes--before rest stop.");
            System.out.println(leg2.getTotalTime() + " minutes--after rest stop.");

            //leg 3

            System.out.printf("Traveled for: %.2f hours.\n",leg3.computeTimeTaken(1000.0, 100.0));
            System.out.println(leg3.getTotalTime() + " minutes--before rest stop.");
            leg3.takeRestStop(90);
            System.out.println(leg3.getTotalTime() + " minutes--after rest stop.");

        } catch (TripComputer.InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
