/**
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 4/5/2023, Tyler M. Kormann, v1.0
 */

public class BankAccount {
    private double balance;
    private double withdraw;
    private double interest;
    private double deposit;
    private double monthlyIntRate;

    public BankAccount()
    {
        monthlyIntRate = 0.035/12;
        balance = 0;
        withdraw = 0;
        interest = 0;
        deposit = 0;
    }
    public BankAccount(double inBalance, double intRate)
    {
        balance = inBalance;
        intRate = intRate / 100;
        monthlyIntRate = intRate / 12;
    }
    public BankAccount(String inBalance, String intRate)
    {
        balance = Double.parseDouble(inBalance);
        double Rate = Double.parseDouble(intRate) / 100;
        monthlyIntRate = Rate / 12;
    }

    public void makeDeposit(double add)
    {
        deposit += add;
        balance += add;
    }
    public void makeDeposit(String add)
    {
        deposit += Double.parseDouble(add);
        balance += Double.parseDouble(add);
    }

    public void makeWithdraw(double sub)
    {
        withdraw += sub;
        balance -= sub;
    }
    public void makeWithdraw(String sub)
    {
        withdraw += Double.parseDouble(sub);
        balance -= Double.parseDouble(sub);
    }

    public void calcInterest() // only positive intrest
    {
        if(balance >= 0)
        {
            interest += balance * monthlyIntRate;
            balance += balance * monthlyIntRate;
        }
    }

    public double getBalance()
    {
        return balance;
    }
    public double getDeposit()
    {
        return deposit;
    }
    public double getWithdraw()
    {
        return withdraw;
    }
    public double getInterest()
    {
        return interest;
    }

}
