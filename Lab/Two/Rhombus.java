package com.neilhanlon.comp285;

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

    }
}

class Test
{
    public static void main()
    {
          

    }
}