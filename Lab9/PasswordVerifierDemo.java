import java.util.Scanner;

/*
 * Password Verifier Demo checks if a password is valid by the rules of the site.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/3/2023, Tyler M. Kormann v1.0
 */
public class PasswordVerifierDemo {
    public static void main(String[] args) {
    
        PasswordVerifier pw;
        Boolean loop = true;
        Scanner getInput = new Scanner(System.in);

        System.out.println("\n\n");//Line break to make output look nicer.

        while(loop)
        {
            System.out.println("Enter a password, to check.");
            System.out.print("Valid passwords are 8+ chars have upper case, lower case, and a number: ");
            pw = new PasswordVerifier(getInput.next());// gets the password to check from the user.

            if(pw.testPassword())//tells the user if the password is valid.
            {
                System.out.println("Password entered is valid.");
            }else{
                System.out.println("Password entered is not valid.");
            }

            System.out.print("Enter yes to check another password: ");
            loop = getInput.next().equalsIgnoreCase("yes");//Sets loop flag to true if user enters "yes".

            System.out.println("\n");//Line break to make output look nicer.
        }

        System.out.print("\n");//Line break to make output look nicer.

        getInput.close();
    }
}
