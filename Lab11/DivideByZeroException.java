public class DivideByZeroException extends Exception
{
    

public DivideByZeroException()
{
    super("Cannot Divide By 0");
}

public DivideByZeroException(String input)
{
    super(input);
}
}
