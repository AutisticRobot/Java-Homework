import java.util.Arrays;

/**
 * Java Final Exam Driver for testing out Athlete and Person 
 * classes and interfaces.  
 *
 * @author Rico Cassoni, richard.cassoni@gcccd.edu
 * @since 5/17/2022
 * @version v1.1
 */
public class Olympics {

    public static void main(String[] args) {
        Athlete gameDay = new Athlete();
        gameDay.setFileNames();
        Athlete[] events = gameDay.csv2Array();
        gameDay.printArray2File(events, "***With TBDs***");
        events[2].setEventName("Javelin");
        events[3].setName("Tommy Track");
        gameDay.printArray2File(events, "***Before sorting events***");
        Arrays.sort(events);
        gameDay.printArray2File(events, "***After sorting events***");
        System.out.println("\"Have a GREAT and SAFE break\"");
    }
}