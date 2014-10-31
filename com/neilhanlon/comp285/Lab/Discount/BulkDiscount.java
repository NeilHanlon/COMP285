

public class BulkDiscount extends DiscountPolicy
{

    private int min;
    private double discountPercent;

    /**
     * Precondition: The value supplied for percent is in the form ##.##% (eg. percent = 50.00, not 0.05)
     * Postcondition: none
    **/
    public BulkDiscount(int minimum, double percent)
    {
        min = minimum;
        discountPercent = percent;
    }

    public double computeDiscount(int count, double itemCost)
    {
        if(count >= min)
        {
            return (itemCost * count) * (discountPercent / 100);
        }
        return -1;
    }
}