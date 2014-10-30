public class TestDiscount
{
    public static void main(String[] args)
    {
        BulkDiscount test1 = new BulkDiscount(10,25);
        System.out.println(test1.computeDiscount(11,5));
    }
}