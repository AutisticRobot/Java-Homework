import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 2/20/2023, Tyler M. Kormann, v1.0
 */

public class Sorting 
{
    public static void main (String[] args){
        int n1;
        int n2;
        int n3;

        int tmp;

        int low;
        int med;
        int high;
        //Create a Scanner object
        //create an input message and use Scanner object collect 3 numbers to be sorted
        Scanner getNum = new Scanner(System.in);


        System.out.print("Enter number 1:");
        n1 = getNum.nextInt();
        System.out.print("Enter number 2:");
        n2 = getNum.nextInt();
        System.out.print("Enter number 3:");
        n3 = getNum.nextInt();

        if(n1 > n2)
        {
            low = n2;
            med = n1;
        }else{
            med = n2;
            low = n1;
        }

        if(med > n3)
        {
            high = med;
            med = n3;
        }else{
            high = n3;
        }

        if(low > med)
        {
            tmp = low;
            low = med;
            med = tmp;

        }

        System.out.println("The inputs sorted smallest to largest are: " + low + ", " + med + ", " + high);
        getNum.close();
        //Message that says - The inputs sorted smallest to largest are: <low> <med> <high>
    }////end main
}////end class
