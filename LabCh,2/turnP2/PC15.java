package pt2;
import javax.swing.JOptionPane;

public class PC15 {
    
    public static void main(String[] args)
    {
        final double commision = .02;
        Double stockAmount;
        Double stockPrice;
        Double totalPrice;

        stockAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the stock ammount to buy:"));
        stockPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the stock price:"));

        totalPrice = stockAmount * stockPrice;
        double priceWComission = totalPrice * commision + totalPrice;
        JOptionPane.showMessageDialog(null, "Price of stocks: $" + totalPrice + "\nPrice of commision: $" + totalPrice * commision + "\nTotal price to pay: $" + priceWComission);

        System.exit(0);
    }
}
