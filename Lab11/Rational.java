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
        numerator = setUserInput();
        denom = setUserInput();

        result = calcRational();

        System.out.printf("With numerator %,.i and denominator %,.i, the result is %,.3f.", numerator, denom, result);
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
