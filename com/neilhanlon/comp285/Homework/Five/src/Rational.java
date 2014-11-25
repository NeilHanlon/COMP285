/**
 * Created by hanlonn on 11/25/2014.
 */
public class Rational {
    private int numerator, denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws DivisionByZeroException {
        if (denominator == 0)
            throw new DivisionByZeroException("Cannot Divide By Zero");
        else
            this.denominator = denominator;
    }

    public Rational(int num, int denom) {
        this.numerator = num;
        this.denominator = denom;
    }

    public static class DivisionByZeroException extends Throwable {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}
