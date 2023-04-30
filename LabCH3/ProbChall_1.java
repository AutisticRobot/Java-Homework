import java.util.Scanner;

/**
 * ProbChall_1 asks...(fill in)
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 2/20/2023, Tyler M. Kormann, v1.0
 */
public class ProbChall_1 {
    public static void main (String[] args){
        int num;
        String romanNum = "";
        boolean isValid = true;
        Scanner getInt = new Scanner(System.in);
        System.out.println("Enter number (1-3)");
        num = getInt.nextInt();
        switch(num){
            case 1:
                romanNum = "I";
            break;
            case 2:
                romanNum = "II";
            break;
            case 3:
                romanNum = "III";
            break;
            default:
                isValid = false;
            break;
        }

        if(isValid)
        {
            System.out.println(num + " converted to Roman Numeral is " + romanNum);
        }else{
            System.out.println(num + " was not not a valid number, must be btw 1->3 ");
        }
        getInt.close();
        
    }
}
