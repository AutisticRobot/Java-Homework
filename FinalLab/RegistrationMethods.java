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
        File fileCheck;

        do
        {
            System.out.print("Enter the path of the csv file to be processed: ");
            filePath = getInput.nextLine();
            fileCheck = new File(filePath);
        }while(!fileCheck.exists());

        inputFileName = filePath;
        filePath = "";

            System.out.print("Enter the path of the output file to be processed: ");
            filePath = getInput.nextLine();

        outputFileName = filePath;
        filePath = "";

            System.out.print("Enter the path of the binary output file to be processed: ");
            filePath = getInput.nextLine();

        binFileName = filePath;
        filePath = "";

        getInput.close();

    }

    @Override
    public void processTextToArrayList(ArrayList<CarOwner> inList)
    {
        File inputFile = new File(inputFileName);
        try {
        getInput = new Scanner(inputFile);
            

        getInput.nextLine();//throws away first Line.

        do{
            CarOwner nextObj = new CarOwner();
            String[] curLine = getInput.nextLine().split(",");

            nextObj.setLastName(curLine[0]);
            nextObj.setFirstName(curLine[1]);
            nextObj.setLicense(curLine[2]);
            nextObj.setMonth(Integer.parseInt(curLine[3]));
            nextObj.setYear(Integer.parseInt(curLine[4]));

            inList.add(nextObj);
        }while(getInput.hasNext());

        } catch (FileNotFoundException e) {
        } catch (NumberFormatException e){

        }finally{
        getInput.close();
        }
    }

    @Override
    public void printArrayListToFile(ArrayList<CarOwner> inList, String inMsg)
    {
        File outFile = new File(outputFileName);
        PrintWriter printOut;
        try
        {
            printOut = new PrintWriter(outFile);
            printOut.println(inMsg);

            for(int i=0;i<inList.size();i++)
            {
                printOut.println(inList.get(i));
            }
            printOut.println("\n");//line for spaceing
            printOut.close();
        }catch (FileNotFoundException e){
            
        }

    }

    @Override
    public void writeListToBinary(ArrayList<CarOwner> inList)
    {
        FileOutputStream outStream;
        try
        {
            outStream = new FileOutputStream(binFileName);
            ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);

            objOutStream.writeObject(inList);

            objOutStream.close();
            outStream.close();

        }catch (FileNotFoundException e){

        }catch (IOException e){

        }
    }

    @Override
    public CarOwner[] readListFromBinary()
    {
        CarOwner[] output = {};
        try
        {
            FileInputStream inStream = new FileInputStream(binFileName);
            ObjectInputStream objInStream = new ObjectInputStream(inStream);

            ArrayList<CarOwner> arrayList;

            arrayList = (ArrayList<CarOwner>)objInStream.readObject();

            output = new CarOwner[arrayList.size()];
            for(int i=0;i<arrayList.size();i++)
            {
                output[i] = arrayList.get(i);
            }

            inStream.close();
            objInStream.close();

        }catch (IOException e){

        }catch (ClassNotFoundException e){

        }
        return output;
    }

    @Override
    public void printArrayToFile(CarOwner[] inArray, String inMsg)
    {
        try
        {
            FileWriter outFile = new FileWriter(outputFileName, true);
            PrintWriter printOut;
            printOut = new PrintWriter(outFile);
            printOut.println(inMsg);

            for(int i=0;i<inArray.length;i++)
            {
                printOut.println(inArray[i]);
            }
            printOut.println("\n");//line for spaceing
            outFile.close();
            printOut.close();
        }catch (IOException e){
            
        }
    }

    @Override
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray)
    {
        int totalMonths = REG_YEAR * 12 + REG_MONTH;
        int counter = 0;

        for(int i=0;i<inArray.length;i++)
        {
            int userMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();

            if(totalMonths - userMonths > 12)
            {
                counter++;
            }
        }

        CarOwner[] output = new CarOwner[counter];
        int index = 0;
        
        for(int i=0;i<inArray.length;i++)
        {
            int userMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();

            if(totalMonths - userMonths > 12)
            {
                output[index] = inArray[i];
                index++;   
            }
        }
        return output;
    }

    @Override
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray)
    {
        int totalMonths = REG_YEAR * 12 + REG_MONTH;
        int counter = 0;

        for(int i=0;i<inArray.length;i++)
        {
            int userMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();
            userMonths = totalMonths - userMonths;

            if(userMonths >  9 && userMonths <= 12)
            {
                counter++;
            }
        }

        CarOwner[] output = new CarOwner[counter];
        int index = 0;
        
        for(int i=0;i<inArray.length;i++)
        {
            int userMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();
            userMonths = totalMonths - userMonths;

            if(userMonths >  9 && userMonths <= 12)
            {
                output[index] = inArray[i];
                index++;   
            }
        }
        return output;
    }
    
}
