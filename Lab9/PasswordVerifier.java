import java.util.Scanner;

/*
 * Password Verifier checks if a password is valid by the rules of the site.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/2/2023, Tyler M. Kormann v1.0
 */

public class PasswordVerifier{
    private String pw;//passoword var. shorted to pw for quicker typing.

    PasswordVerifier(String pw)//Password constructor.
    {
        this.pw = pw;
    }
     
    //@return true
    public boolean testPassword()
    {
        boolean hasUC = false;//has Uppercase flag
        boolean hasLC = false;//has Lowercase flag
        boolean hasN = false;//has Number flag

        if(pw.length() < 8)//checks password length.
        {
            return false;
        }

        for(int i=0;i<pw.length();i++)//Iterates over every char in password.
        {
            char c = pw.charAt(i);

            if(Character.isUpperCase(c))//char is uppercase
            {
                hasUC = true;
            }

            if(Character.isLowerCase(c))//char is lowercase
            {
                hasLC = true;
            }

            if(Character.isDigit(c))//char is number
            {
                hasN = true;
            }
        }

        if(hasUC && hasLC && hasN)// checks if flags are set to true.
        {
            return true;
        }else{
            return false;
        }

    }
}