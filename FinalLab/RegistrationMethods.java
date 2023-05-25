import java.util.*;
import java.io.*;

public class RegistrationMethods implements RegistrationMethodsInterface
{
    private Scanner getInput;
    private String inputFileName;
    private String outputFileName;
    private String binFileName;

    

    @Override
    public void setFileNames()
    {
        String filePath = "";
        getInput = new Scanner(System.in);

        while(!new File(filePath).exists())
        {
            System.out.print("Enter the path of the csv file to be processed: ");
            filePath = getInput.next();
        }
        inputFileName = filePath;
        filePath = "";

        while(!new File(filePath).exists())
        {
            System.out.print("Enter the path of the output file to be processed: ");
            filePath = getInput.next();
        }
        outputFileName = filePath;
        filePath = "";

        while(!new File(filePath).exists())
        {
            System.out.print("Enter the path of the binary output file to be processed: ");
            filePath = getInput.next();
        }
        binFileName = filePath;
        filePath = "";

        getInput.close();

    }

    @Override
    public void processTextToArrayList(ArrayList<CarOwner> inList)
    {
    }

    @Override
    public void printArrayListToFile(ArrayList<CarOwner> inList, String inMsg)
    {
    }

    @Override
    public void writeListToBinary(ArrayList<CarOwner> inList)
    {
    }

    @Override
    public CarOwner[] readListFromBinary()
    {
    }

    @Override
    public void printArrayToFile(CarOwner[] inArray, String inMsg)
    {
    }

    @Override
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray)
    {
    }

    @Override
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray)
    {
    }
    
}
