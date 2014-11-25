import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by hanlonn on 11/25/2014.
 */
public class ServiceRequestsTest {
    public static void main(String[] args) {
        ServiceRequests req = new ServiceRequests();
        try (Scanner keyboard = new Scanner(System.in)) {
            int choice = -1;
            String name;
            while (choice != 0) {
                System.out.print("Type 1 to add name, 2 to remove name, 3 to get all requests, 0 to exit: ");
                choice = keyboard.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the name to add: ");
                        try {
                            req.addName(keyboard.next());
                            System.out.println("Added name. There are now " + req.getNumber() + " requests.");
                        } catch (ServiceRequests.ServiceBackupException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Enter the name to remove.");
                        try {
                            req.removeName(keyboard.next());
                            System.out.println("Removed Name. There are now " + req.getNumber() + " requests.");
                        } catch (ServiceRequests.NoServiceRequestException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 3:
                        for (String n : req.getNames()) {
                            if (n != null)
                                System.out.println(n);
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("That is not a valid choice. Try again.");
                        break;
                }
            }
        } catch (InputMismatchException e) {

        }
    }
}
