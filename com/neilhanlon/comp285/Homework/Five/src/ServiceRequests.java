import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hanlonn on 11/25/2014.
 */
public class ServiceRequests {
    private static int requests;
    private String[] names = new String[10];

    public static int getNumber() {
        return requests;
    }

    public String[] getNames() {
        return names;
    }
    public String getName(int index)
    {
        return names[index];
    }

    public void addName(String name) throws ServiceBackupException {
        if (requests != names.length) {
            names[requests] = name;
            requests++;
        } else {
            throw new ServiceBackupException("No room left in ServiceRequest. Service is backed up.");
        }
    }
    public void removeName(String name) throws NoServiceRequestException
    {
        Set<String> temp = new HashSet<String>(Arrays.asList(names));
        if(temp.contains(name))
        {
            temp.remove(name);
        } else {
            throw new NoServiceRequestException("Name not found");
        }
        names = new String[10];
        int i = 0;
        for(String n : temp)
        {
            if(n != null) {
                names[i] = n;
                i++;
            }
        }
        requests--;
    }

    public static class ServiceBackupException extends Exception {
        public ServiceBackupException(String message) {
            super(message);
        }
    }

    public static class NoServiceRequestException extends Throwable {
        public NoServiceRequestException(String s) {
            super(s);
        }
    }
}
