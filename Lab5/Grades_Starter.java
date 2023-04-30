import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Set;
import java.io.*;  //Note - Since we are using multiple classes from java.io, we can use the * wildcard vs listing each individually.  Any 2+, it is best to use *

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 3/1/2023, Tyler M. Kormann, v1.0
 */
public class Grades_Starter{ 
    public static void main (String[] args) throws IOException{  //look how small main() is when we divide and conquer into (resusable) methods!  Only 4 lines!!!
        String inFile , outFile;//String vars inFile, outFile for the file names
        inFile = getInFile();//set inFile using getInFile()
        outFile = getOutFile();//set outFile using getOutFile()
        processFile(inFile, outFile);//call processFile() with inFile and outFile as arguments
        System.exit(0);//System.exit(0) since JOptionPane was used
    }//end main

    /**
     * Uses JOptionPane to get and return input file name
     * @return name of file from JOptionPane  //NOTE - Description only for return
     */
    public static String getInFile() throws IOException
    { //Requires throws IOException since File throws IOException
        String path;
        path = JOptionPane.showInputDialog(null, "Enter the name of the input file (ie input.txt)");//.  Assign to String var from above
        File Input = new File(path);
        //create a while loop pit to ensure that file .exists (remember if it exists, you don't need to be in the pit.  Think ! here
        while(!Input.exists())
        {
            path = JOptionPane.showInputDialog(null, "Enter the name of the input file (ie input.txt)");//.  Assign to String var from above
            Input = new File(path);
        }
        
        return path;
    }

    public static String getOutFile() throws IOException
    {

    /**
     * uses JOptionPane to get output file from user
     * @return name of file given by user
     */
     
    String output = JOptionPane.showInputDialog(null, "Enter the name of the output file.");
    return output;
    }
        
    /**
     * <Put description in here for processFile method.  NOTE can be several lines if necessary
     * <Need to create two @param entry lines>
     */
    //create a void processFile method with 2 String parameters.  Since working with File, will need throws IOException
    public static void processFile(String inFile, String outFile) throws IOException
    {
        ////vars section
        //int var number to assign from Scanner input
        int numberInput;
        //int var accumulators for As,Bs,Cs,Ds,Fs,min,max
        int As,Bs,Cs,Ds,Fs,min,max;
        int total,count;
        //double var for avg     
        double avg;
        //int var set for each line of grades with 1 assigned
        int gradSet = 0;

        ////Scanner and PrintWriter streams section
        //create File object to create a file from inFileName param
        File file = new File(inFile);
        //create Scanner object with File object from above.  NOTE-You know this will work based on while pit in getInFile()
        Scanner readFile = new Scanner(file);
        //create PrintWriter object with inOutFile from method param.  NOTE-PrintWriter creates a new file or overwrites an 
        PrintWriter writeFile = new PrintWriter(outFile);
        //    existing file if using FileWriter.

        //outer while loop to test if Scanner object .hasNextLine()
        while(readFile.hasNextLine())
        {
            As=Bs=Cs=Ds=Fs=count=0; //  since new line of scores to average
            avg = 0;//set average to 0.0 since new line of scores to average
            numberInput = readFile.nextInt();//set number var to Scanner object using nextInt()
            min=max=numberInput;//set min=max=number
            total=count=0;
            //inner while loop looking for sentinel (-1).  -1 will cause while loop to stop reading.  Think how you will use ! here
            while(numberInput != -1)
            {
                if(numberInput < min)
                {
                    min = numberInput;//set min to number
                }
                //repeat the same except for max this time 
                if(numberInput > max)
                {
                    max = numberInput;
                }
                //increment count since you will use this as the denominator to calculate average
                count++;
                //add number to the total accumulator.  Think += here
                total += numberInput;

                //if-else if section to set increment the proper letter grade accumulators
                if(numberInput >= 90)
                {
                    As++;
                }else if (numberInput >= 80){
                    Bs++;
                }else if (numberInput >= 70){
                    Cs++;
                }else if (numberInput >= 60){
                    Ds++;
                }else{
                    Fs++;
                }
                //account for all letter grades

                //need to read in the next number using Scanner object with .nextInt().  You are in a while pit to process each grade for each line
                numberInput = readFile.nextInt();
            }//end while
            
            //Write to the PrintWriter object (ie outStream) like you would to the screen (ie .println("Set " + set + " of grades calculated")
            writeFile.println("Set " + gradSet + " of grades calculated");
            gradSet++;
            if(count == 0)
            { //to determine whether a line with -1 only, if so, count is still 0
                //print to PrintWriter object, No grades to average
                writeFile.println("no grades to average");
            }else{
                //print to PrintWriter object, Number of As: along with the value in the As accumulator
                writeFile.println("number of As: " + As);
                writeFile.println("number of Bs: " + Bs);
                writeFile.println("number of Cs: " + Cs);
                writeFile.println("number of Ds: " + Ds);
                writeFile.println("number of Fs: " + Fs);
                //print to PrintWriter object, The high score was: along with the value in max
                writeFile.println("Highest score: " + max);
                writeFile.println("lowest score: " + min);
                //compute avg. NOTE-Both total and count are integers.  You will need to cast here (double).
                avg = (double)total / (double)count;
                //print to PrintWriter object, The avg score is: nicely formatted to 1 decimal place
                writeFile.printf("The avrage score is: %.2f \n", avg);
            }//end else
        }//end while for each line
        System.out.println("Grade processing is completed");
        System.out.println("You can retrieve the output file at: " + file.getAbsolutePath());
        //close the inStream and outStream using the .close() for each
        readFile.close();
        writeFile.close();
    }//end processFile()
}//end Grades class