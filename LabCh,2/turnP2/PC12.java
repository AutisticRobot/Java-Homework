package pt2;
import java.util.Scanner;

public class PC12 {
    public static void main(String[] args)
    {
        Scanner getCity = new Scanner(System.in);

        String city;

        System.out.print("Enter a city: ");
        city = getCity.nextLine();

        int length = city.length();
        String upperCase = city.toUpperCase();
        String lowerCase = city.toLowerCase();
        char inital = city.charAt(0);

        System.out.print("The city has " + length + " chars.\n");
        System.out.print("In uppercase:" + upperCase);
        System.out.print("\nIn lowercase:" + lowerCase + "\n");
        inital = Character.toUpperCase(inital);
        System.out.print("First character:" + inital + "\n");
        getCity.close();
    }
    
}
