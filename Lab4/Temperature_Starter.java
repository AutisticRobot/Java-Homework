import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 3/5/2023, Tyler M. Kormann, v1.0
 */

public class Temperature_Starter{  
    public static void main (String[] args){
        ////vars section
        //create vars for inputTemp, output (num with decimal), and char inputUnit
        String inputTemp;
        int numInput;
        double output;
        char inputUnit;
        boolean run = true;

        //create Scanner object to read in keyboard
        Scanner getInput = new Scanner(System.in);

        do
        {  ////create working program and then put in do-while
            System.out.println("Enter a whole number, a space, and a C or F (ie 100 F converts to Cels)");
            //get inputTemp
            numInput = getInput.nextInt();
            inputTemp = getInput.next();
            //get inputUnit, recommend forcing toUpperCase or toLowerCase
            inputUnit = inputTemp.toLowerCase().charAt(inputTemp.length() - 1);
            //  before getting char.  This will make the while pit easier :-)

            while(inputUnit != 'f' && inputUnit != 'c')
            {
                System.out.println("Enter a C or F.");
                inputTemp = getInput.next();
                //get inputUnit, recommend forcing toUpperCase or toLowerCase
                inputUnit = inputTemp.toLowerCase().charAt(inputTemp.length() - 1);
                //  before getting char.  This will make the while pit easier :-)

            }

            //if inputUnit is 'F'  ////remember a primitive type therefore use ==
            if(inputUnit == 'f')
            {
                output = ((double)numInput - 32) * 5 / 9;
            }else{
                output = ((double)numInput * 9 / 5) + 32;
            }
            System.out.printf("\n%.1f %c\n", output, inputUnit);
            //Now you can will need to collect input for the do-while part
            System.out.println("Do you want to calculate another temp? (Y or N)");
            //Message to user to enter yes to calculate another temp.
            if(!getInput.next().equalsIgnoreCase("y"))
            {
                run = false;
            }
        }while(run); //can either use the String collected with equalsIgnoreCase("yes") or force 
        //      toUpperCase/toLowerCase and then grab charAt(0) and have the while evaluate to == 'Y' (or 'y')
        getInput.close();
    }//// end main ()
}//// end class