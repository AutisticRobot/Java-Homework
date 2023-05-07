import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * SalesAnalysis class holdes the functions for processing sales data.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/4/2023, Tyler M. Kormann, v1.0
 */
public class SalesAnalysis {
    private File file;
    private String fileName;
    private Scanner getData;
    private ArrayList<Double> totalList = new ArrayList<>();

    public SalesAnalysis(String inFile)
    {
        fileName = inFile;
    }

    public void processFile() throws IOException
    {
        file = new File(fileName);
        getData = new Scanner(file);

        while(getData.hasNextLine())
        {
            String[] curWeek;//array for the current week
            String tmp;// temp string to store the next for testing

            tmp = getData.nextLine();
            curWeek = tmp.split(",");//Splits the line into individual values

            setArrayListElement(curWeek);
        }

        getData.close();
    }

    private void setArrayListElement(String[] inArray)
    {
        double total = 0;

        for(String num : inArray)
        {
            total += Double.parseDouble(num);
        }

        totalList.add(total);
    }

    public void writeOutput()
    {
        System.out.println(totalList.get(0));
    }
    
}
