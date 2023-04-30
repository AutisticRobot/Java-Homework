import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 2/28/23, Tyler M.Kormann, v1.0
 */

public class FallingDistance_Starter{ 
    //public constant for acceleration
    public static final double ACCELERATION = 9.8;  
    public static void main (String[] args) {
        Scanner getTime = new Scanner(System.in);
        double distance = 0;
        int numOfSecs = 0;

        System.out.println("Please enter how many seconds to compute: ");
        numOfSecs = getTime.nextInt();

        System.out.println("/---------------=---------------\\");
        System.out.println("|     time\t|    Distance\t|");
        System.out.println("|---------------=---------------|");
        //for loop that runs for each second
        for(int i = 0 ;i < numOfSecs; i++)
        {
            int time = i + 1;
            distance = getDistance(time);
            distance = Math.round(distance * 100);
            distance = distance / 100;
            System.out.println("|\t" + time + "\t|      " + distance + "\t|");
        }
        System.out.println("\\---------------=---------------/");
        //  distance is assigned by getDistance() that passes current second from for loop
        //  Display current second and distance with nice formatting (2 dec places for distance).  printf will work well here
    } //end main
    /**
     * Put getDistance javadocs here.  Include description along with @param and @return tags
     */
    public static double getDistance(int time)
    {
        return .5 * ACCELERATION * time * time;
    }
}//end class