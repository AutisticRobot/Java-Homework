import java.util.InputMismatchException;

/**
 * RationalInterface
 */
public interface RationalInterface {

    
    public void doRational() throws DivideByZeroException;
    public int setUserInput() throws InputMismatchException;
    public double calcRational() throws DivideByZeroException;
}