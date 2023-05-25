
/*
 * CarOwnerInterface is an Interface for carOwner class.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/24/2023, Tyler M. Kormann, v1.0
 */
public interface CarOwnerInterface extends Comparable{
    

String license = "";
int month = 0;
int year = 0;

public void setLicense(String inLicense);
public String getLicense();
public void setMonth(int inMonth);
public int getMonth();
public void setYear(int inYear);
public int getYear();
public int compareTo(Object o);
public String toString();


}
