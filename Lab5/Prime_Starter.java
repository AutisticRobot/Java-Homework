import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 3/1/2023, Tyler M. Kormann, v1.0
 */
public class Prime_Starter{
    public static void main (String[] args) {
        boolean isPrime;
        int number;            //original number to test
        String playAgain;      //string to test to calc another number
        Scanner getInput = new Scanner(System.in);
        do{ //get program working first and then incorporate do while to play again
            System.out.println("Enter a whole number>2 (ie 19) to test if prime");
            number = getInput.nextInt();
            //set isPrime to the result of testForPrime(number)
            isPrime = testForPrime(number);
            //if else to test if isPrime.  Display number and whether prime.
            if(isPrime)
            {
                System.out.println(number + " is a prime number");
            }else{
                System.out.println(number + " is not a prime number");
            }
            
            //Display message to test another number, something like Enter yes to test another number, no to quit
            System.out.println("Test another number or type no to quit.");

            playAgain = getInput.nextLine();
        }while(!playAgain.equalsIgnoreCase("no")); //to see if playAgain is String yes (recommend method that ignores case
    }//end main

    /**
     * Insert javadocs here - description, @param, @return
     */
    //write header here for testForPrime.  Can be public or private, but needs to be static.  Return type? Needs 1 param
    public static boolean testForPrime(int num)
    {
        int halfPlusOne = num / 2 + 1;           //gets input from user, divides by 2 and adds1,  this shortens the testing and makes more effecient
        boolean isPrimeMeth = true;//assumes number is prime

        for(int i=2;isPrimeMeth&&i<=halfPlusOne;i++){  //declare and set int var to 2  //Can start here vs 1 for one less run
            if(num % i == 0)
            {
                isPrimeMeth = false;
            }
        }
        return isPrimeMeth;
    }//end testForPrime
}//end Prime