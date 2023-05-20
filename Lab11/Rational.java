import java.util.InputMismatchException;
import java.util.Scanner;

public class Rational implements RationalInterface
{
    

    private int numerator;
    private int denom;
    private double result;

    public Rational()
    {
        numerator = 0;
        denom = 0;
        result = 0.0;
    }

    @Override
    public void doRational() throws DivideByZeroException
    {
        System.out.println("Set the Numerator: ");
        numerator = setUserInput();
        System.out.println("Set the Denominator: ");
        denom = setUserInput();

        result = calcRational();

        System.out.printf("\nWith numerator %,.i and denominator %,.i, the result is %,.3f.\n", numerator, denom, result);
    }

    @Override
    public int setUserInput() throws InputMismatchException
    {
        Scanner getInput = new Scanner(System.in);
        if(getInput.hasNextInt())
        {
            return getInput.nextInt();
        }else{
            throw new InputMismatchException();
        }
    }

    @Override
    public double calcRational() throws DivideByZeroException
    {
        if(numerator == 0 && denom == 0)
        {
            throw new DivideByZeroException("Cannot Divide By Zero.");
        }

        return (double) numerator / denom;

    }

    
}
