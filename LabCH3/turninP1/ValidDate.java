import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 2/20/2023, Tyler M. Kormann, v1.0
 */

public class ValidDate {
    public static void main (String[] args){
        int month;
        int day;
        int year;

        String temp;
        String output;

        Scanner getDate = new Scanner(System.in);
        getDate.useDelimiter("/");

        output = " ";
        System.out.println("Enter date in mm/dd/yyyy format");
        month = getDate.nextInt();
        day = getDate.nextInt();
        //year = getDate.nextInt();
        
        temp = getDate.nextLine().substring(1);  //ie, assigns "2022" to temp, if /2022 is in the buffer!

        year = Integer.parseInt(temp);

        boolean isValid = false;
        
        ////Create if-else if to look for when:
        ////Section 1, day is less than 1
        if (day < 1)
        {
            isValid = false;
            output = "Day has to be more than 0";
        }else if (day > 31){
            isValid = false;
            output = "Day has to be less than the longest month";
        }else{  
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(day <= 31)
                    {
                        isValid = true;
                    }else{
                        output = "Day has to be less than the longest month";
                        isValid = false;
                    }
                break;
                
                case 4:
                case 6:
                case 9:
                case 11:
                    if(day <= 30)
                    {
                        isValid = true;
                    }else{
                        output = "Day has to be less than the specified month";
                        isValid = false;
                    }
                break;
                    
                ////This is February
                case 2: 
                    //create isLeapYear flag and set to false
                    boolean isLeapYear = false;
                    if(year%400==0 || (year%4==0&&!(year%100==0)))
                    {  
                        isLeapYear = true;
                    }
                    
                    if (isLeapYear){ ////use isLeapYear flag
                        if(day <= 29)
                        { //Update X
                            isValid = true;
                        }else{
                            output = "Day has to be less than 30 in a leap-year";
                            isValid = false;
                        }
                    }else{  ////non-leap year
                        if(day <= 28)
                        { //Update X
                        isValid = true;
                            //Update isValid to true
                        }else{
                            output = "Day has to be less than 29 in a non leap-year";
                            isValid = false;
                        }
                    }
                break;
                //Default case if month is not between 1 and 12
                default:
                    isValid = false;
                    output = "Has to be a month between 1 and 12";
                break;
                    //Update output to something like - Months must be btw 1 and 12.
            }////End of switch
        }////End of else section for multibranch if-else if
        
        //// Output section using isValid flag
        if (isValid)
        {
            System.out.println(month + "/" + day + "/" + year);
        }else{
            System.out.println(month + "/" + day + "/" + year + " is not a valid year.\n" + output);

        }
            //Print month/day/year is not a valid date. + output
            //*/
    }////end main
}////end class
