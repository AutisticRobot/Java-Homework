package pt2;
import java.util.Scanner;

public class PC2 {
    public static void main(String[] args)
    {
        String firstName;
        String middleName;
        String lastName;

        char firstInit;
        char middleInit;
        char lastInit;

        Scanner getName = new Scanner(System.in);

        System.out.print("What is your first name: ");
        firstName = getName.next();

        System.out.print("What is your middle name: ");
        middleName = getName.next();

        System.out.print("What is your last name: ");
        lastName = getName.next();

        System.out.print("my name is: " + firstName + " " + middleName  + " " + lastName + "\n");

        firstInit = firstName.charAt(0);
        middleInit = middleName.charAt(0);
        lastInit = lastName.charAt(0);

        System.out.print("my initials are: " + firstInit + middleInit + lastInit + "\n");
        getName.close();
    }
}
