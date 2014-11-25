/**
 * Created by hanlonn on 11/25/2014.
 */
public class TripComputer {
    private static int totalTime;
    private boolean restStopTaken;

    public int getTotalTime() {
        return totalTime;
    }

    public boolean isRestStopTaken() {
        return restStopTaken;
    }

    public double computeTimeTaken(double distance, double velocity) throws InvalidInputException {
        if (distance < 0 || velocity < 0)
            throw new InvalidInputException("Neither Distance nor Velocity should be negative.");
        else {
            double temp = distance / velocity;
            totalTime += temp * 60;
            return temp;
        }
    }
    public void takeRestStop(int time) throws InvalidInputException, StopAlreadyTakenException{
        if(time > 0)
        {
            if(!restStopTaken) {
                totalTime += time;
                restStopTaken = true;
            } else {
                throw new StopAlreadyTakenException("You cannot take two rest stops in one leg.");
            }
        } else {
            throw new InvalidInputException("Time must be non-negative.");
        }
    }

    public class InvalidInputException extends Throwable {
        public InvalidInputException(String s) {
            super(s);
        }
    }

    public class StopAlreadyTakenException extends Throwable {
        public StopAlreadyTakenException(String s) {
            super(s);
        }
    }
}
