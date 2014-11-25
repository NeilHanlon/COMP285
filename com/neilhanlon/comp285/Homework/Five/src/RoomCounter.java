/**
 * Created by hanlonn on 11/25/2014.
 */
public class RoomCounter {
    private static int count;

    public void addPerson() {
        count++;
    }

    public void removePerson() {
        if((count - 1) > 0)
            count--;
    }

    public static int getCount() {
        return count;
    }
}
