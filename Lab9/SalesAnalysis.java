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
        int weekCount = 0;
        double min = totalList.get(0);//initialized to week 1 to start
        int minWeek = 1;
        double max = 0;
        int maxWeek = 0;
        double total = 0;

        System.out.print("\n");
        for(double week : totalList)
        {
            weekCount++;
            total += week;

            if(week > max)
            {
                max = week;
                maxWeek = weekCount;
            }
            if(week < min)
            {
                min = week;
                minWeek = weekCount;
            }

            System.out.println("Week #" + weekCount + " Info");
            System.out.printf("Total Sales: $%,.2f\n", week);
            System.out.printf("Avg Daily Sales for Week: $%,.2f\n", week / 7);
            System.out.print("\n");
        }

        System.out.printf("Total Sales for all Weeks: $%,.2f\n", total);
        System.out.printf("Avg Weekly Sales : $%,.2f\n", total / weekCount);
        System.out.println("Week #" + maxWeek + " had the Highest amount of sales");
        System.out.println("Week #" + minWeek + " had the lowest amount of sales");

        System.out.print("\n");
    }
    
}
