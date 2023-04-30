package pt2;
import java.util.Scanner;

public class PC13 {
    public static void main(String[] args)
    {
        final double tax = 0.0675;
        final double tip = 0.20;

        Scanner getPrice = new Scanner(System.in);

        System.out.print("Enter meal price:");
        double price = getPrice.nextDouble();

        System.out.print("\nThe tax is: $" + price * tax + "\n");
        price = price + price * tax;
        System.out.print("The tip is: $" + price * tip + "\n");
        price = price + price * tip;
        System.out.print("The total is : $" + price + "\n");
        getPrice.close();
    }
    
}
