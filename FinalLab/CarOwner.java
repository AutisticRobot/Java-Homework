import java.io.Serializable;

/*
 * CarOwnerInterface is an Interface for carOwner class.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/24/2023, Tyler M. Kormann, v1.0
 */
public class CarOwner extends Citizen implements CarOwnerInterface{

String license;
int month;
int year;

public CarOwner()
{
    setFirstName("No");
    setLastName("Name");
    license = "Not Assigned";
    month = 0;
    year = 0;
}
public CarOwner(String inLast, String inFirst, String inLicense, int inMonth, int inYear)
{
    setFirstName(inFirst);
    setLastName(inLast);
    license = inLicense;
    month = inMonth;
    year = inYear;
}

@Override
public void setLicense(String inLicense)
{
    license = inLicense;
}
@Override
public String getLicense()
{
    return license;
}
@Override
public void setMonth(int inMonth)
{
    month = inMonth;
}
@Override
public int getMonth()
{
    return month;
}
@Override
public void setYear(int inYear)
{
    year = inYear;
}
@Override
public int getYear()
{
    return year;
}
/**
* overrides compareTo to sort CarOwners based on chronological
* of month and year car was last. If param is null or not CarOwner
class, returns -1
* if object total months < param total months, temp is -1, object total
months > param total months, temp is 1
* otherwise the same and temp is 0
* @return temp
*/
@Override
public int compareTo(Object o){
    int temp = -1;
    if(o != null && getClass() == o.getClass())
    {
        CarOwner copy = (CarOwner)o;
        if((year*12+month) < (copy.year*12+copy.month))
        {
            temp = -1;
        }else if ((year*12+month) > (copy.year*12+copy.month)){
        temp = 1;
        }else{ //the same
        temp = 0;
        }
    }
    return temp;
}
@Override
public String toString()
{
    String output = "";

    output += super.toString();
    output +=  "\t\t";
    output += license + "\t\t";
    output += month + "/" + year;

    return output;
}

}
