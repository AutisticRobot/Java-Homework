import java.util.InputMismatchException;

public class RationalDemo {
public static void main(String[] args) {


Rational rat1 = new Rational();

System.out.println("\n");//spacing for output formatting.

try
{
    rat1.doRational();
}catch(DivideByZeroException e){
    System.out.println(e.getMessage());
}catch(InputMismatchException e){
    System.out.println("try running the program again, this time use integers for num and denom");
}finally{
    System.out.println("The Program is Done Running. You May Now Go On With Your Day.");
    System.out.println("\n");//spacing for output formatting.

}


}
}
