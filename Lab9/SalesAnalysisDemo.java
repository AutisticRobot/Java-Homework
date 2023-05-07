import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Sales Analysis Demo shows off the capibilites of the Sales analysis java class.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/4/2023, Tyler M. Kormann, v1.0
 */
public class SalesAnalysisDemo {
    public static void main(String[] args) throws IOException{
        Scanner getInput = new Scanner(System.in);
        String file;

        System.out.print("\n\nEnter the path to the SalesData.txt file: ");//asks the user for the text file for input. two line brakes for styling.
        file = getInput.next();

        if(new File(file).exists())
        {
            SalesAnalysis salesFile = new SalesAnalysis(file);

            salesFile.processFile();
            salesFile.writeOutput();
        }else{
            System.out.println("File Does Not Exist");
        }

        
    }
    
}
