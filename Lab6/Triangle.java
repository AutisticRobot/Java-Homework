import java.util.Scanner;

/**
 * Triangle for Lab6 Part1
 * @author Tyler M. Kormann
 * @version 1.0
 * @since 3/13/2022
 */


public class Triangle {
    String triName = "Unknown";
    double triBase = 0.0;
    double triHeight = 0.0;
    double triArea = 0.0;
    Scanner getInput = new Scanner(System.in);
    
    //Triangle Constructior
    public Triangle()
    {

    }
    public Triangle(String name, Double base, Double height)
    {
        triName = name;
        triBase = base;
        triHeight = height;
    }
    public void readInput()
    {
        //name
        System.out.println("what is the triangle's name?:");
        triName = getInput.next();
        //base
        System.out.println("what is the triangle's base?:");
        triBase = getInput.nextDouble();
        //height
        System.out.println("what is the triangle's height?:");
        triHeight = getInput.nextDouble();

    }
    public void writeOutput()
    {
        triArea = (triBase * triHeight) / 2;

        //name
        System.out.println("Triangle name is: " + triName);
        //base
        System.out.println("Triangle base is: " + triBase);
        //height
        System.out.println("Triangle height is: " + triHeight);
        //area
        System.out.printf("Triangle area is: %.1f\n",triArea);

    }
    public void setName(String name)
    {
        triName = name;
    }
    public void setBase(double base)
    {
        triBase = base;
    }
    public void setHeight(double Height)
    {
        triHeight = Height;
    }
}
