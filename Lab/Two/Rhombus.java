import java.util.Scanner;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.LinkedList;

public class Rhombus
{
    private List<Integer> sides;

    Rhombus()
    {
        sides = new LinkedList<Integer>(Arrays.asList(0,0,0,0));
    }
    Rhombus(int side)
    {
        sides = new LinkedList<Integer>(Arrays.asList(side,side,side,side));
    }
    /*
    * This constructor expects that the input is top, right, bottom, left when called.
    */
    Rhombus(int top, int right, int bottom, int left)
    {
        sides = new LinkedList<Integer>(Arrays.asList(top,right,bottom,left));
    }

    Rhombus(Rhombus aRhombus)
    {
        sides = new LinkedList<Integer>(aRhombus.sides);
    }

    public List getSides()
    {
        return sides;
    }
    public void setSides(List<Integer> newSides)
    {
        sides = newSides;
    }

    public boolean equals(Rhombus poly2)
    {
        Rhombus mutablePoly = new Rhombus(this);
        boolean result = false, area = false;
        int commonSides = 0;
        if(sides.equals(poly2.sides))
        {
            return true;
        }
        if(sides.get(0) * sides.get(1) == poly2.sides.get(0) * poly2.sides.get(1))
        {
            area = true;
        }
        System.out.println("size: "+poly2.sides.size());
        for(int i = 0; i < poly2.sides.size(); ++i)
        {
            if(sides.contains(poly2.sides.get(i)))
            {
                commonSides++;
                mutablePoly.sides.remove(poly2.sides.get(i));
            }
        }
        result = (commonSides == 4) ? true : false;
        return (result && area) ? true : false;
        
    }


    public static void main(String[] args)
    {
        Rhombus noside = new Rhombus();
        System.out.println(noside.getSides());

        Rhombus square = new Rhombus(2);
        System.out.println(square.getSides());  

        Rhombus rect = new Rhombus(1,2,2,1);
        System.out.println(rect.getSides());

        Rhombus rect2 = new Rhombus(2,1,1,2);
        System.out.println(rect2.getSides());

        Rhombus rect3 = new Rhombus(2,3,3,2);
        System.out.println(rect3.getSides());

        if(rect.equals(rect2)){
            System.out.println("Rectangles are equal.");
        }
        if(rect.equals(rect3))
        {
            System.out.println("Something is wrong.");
        }
        else
        {
            System.out.println("Nope... that's right.");
        }
    }
}

class Test
{
    public static void main()
    {
          

    }
}