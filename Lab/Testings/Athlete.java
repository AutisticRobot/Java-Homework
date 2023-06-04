import java.io.*;
import java.util.Scanner;

import javax.lang.model.element.TypeElement;

public class Athlete extends Person implements AthleteInterface
{

    private String eventName;
    private String inputFile;
    private String outputFile;
    final public int ARRAY_SIZE = 4;

    public Athlete()
    {
        eventName = "TBD";
    }
    public Athlete(String inName, String inEventName)
    {
        super(inName);
        eventName = inEventName;
    }

    @Override
    public void setFileNames()
    {
        Scanner getInput = new Scanner(System.in);
        String tmp;
        boolean exists = false;
        do
        {
            System.out.println("Enter path for input file");
            tmp = getInput.next();
            exists = new File(tmp).exists();
        }while(!exists);
        inputFile = tmp;

        System.out.println("Enter path for output file");
        tmp = getInput.next();
        outputFile = tmp;

        getInput.close();
    }

    @Override
    public Athlete[] csv2Array()
    {
        Athlete[] input = new Athlete[ARRAY_SIZE];
        try
        {
            Scanner getInput = new Scanner(new File(inputFile));
            int i = 0;
            while(getInput.hasNext())
            {
                String[] curLine;
                String tmpName;
                String tmpEvent;
                curLine = getInput.nextLine().split(",");
                tmpName = curLine[0];
                tmpEvent = curLine[1];
                input[i] = new Athlete(tmpName, tmpEvent); 
                i++;
            }
            getInput.close();
        }catch(FileNotFoundException e){
        }
        return input;
    }

    @Override
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

    @Override
    public void printArray2File(Athlete[] inArray, String inMsg)
    {
        try
        {
            FileWriter fileWrite = new FileWriter(outputFile, true);
            PrintWriter output = new PrintWriter(fileWrite);

            output.println(inMsg);
            output.println(new Athlete("Athlete", "Event Name").toString());

            for (int i=0;i<inArray.length;i++)
            {
                output.println(inArray[i].toString());
            }
            output.println("");
            output.close();
        }catch(IOException e){

        }
    }

    /**
    * CompareTo to be used in sorting Athlete[]'s
    *
    * @param o Object that is passed to determine if it is less than,
    * equal, or more than calling object.
    * @return -1,0,1
    */
    @Override
    public int compareTo(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Athlete temp = (Athlete) o;
            return this.eventName.compareTo(temp.eventName);
        }
        return -1;
    }

    public String toString()
    {
        return super.toString() + "\t\t" + eventName;
    }
    
}
