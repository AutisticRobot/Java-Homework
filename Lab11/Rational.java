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
        if(numerator == 0 && denom == 0)
        {
            throw new DivideByZeroException("Cannot Divide By Zero.");
        }
    }

    @Override
    public int setUserInput()
    {

    }

    @Override
    public double calcRational()
    {

    }

    
}
