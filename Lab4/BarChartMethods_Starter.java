import java.util.Random;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 3/6/2023, Tyler M. Kormann, v1.0
 */
public class BarChartMethods_Starter{ 
    public static void main (String[] args) {
        ////vars section
        int first, second, third;

        ////generate and assign random numbers section
        //Create a Random object (ie generator)
        Random getRand = new Random();
        //Use generator to create a random number btw 0 and 999 and assign to first.  Do the same for second and third
        first = getRand.nextInt(999);
        second = getRand.nextInt(999);
        third = getRand.nextInt(999);
        
        ////Print out numbers
        //Message to print out something like, Number 1 is: XXX. Do the same for Number 2 and 3
        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        //Print blank line
        System.out.println("");

        ////Bar Chart Section
        //Print out NUMBER BAR CHART as a header
        System.out.println("NUMBER BAR CHART");
        
        ////first stars
        System.out.print("Number 1: ");// without a line break
        printStars(first);
        
        ////second stars
        System.out.print("Number 2: ");// without a line break
        printStars(second);
        
        ////third stars
        System.out.print("Number 3: ");// without a line break
        printStars(third);
    }////end main()

    /**
     * Accepts int input and prints stars
     * @param input - number of stars to print out
     */
    public static void printStars(int input){
        if (input<100)
        {
            System.out.print("<100 no stars");
        }else{
            for(int i = 100; i <= input; i += 100)
            { //loop that prints out stars for each 100 (ie 356 prints out 3 stars).  Take advantage of integer division here (input/100)
                System.out.print("*");//Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
            }
        }//Print line to get to a new line
        System.out.print("\n");
    }////end printStars()
}////end Grades