/*
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/13/2023, Tyler M. Kormann v1.0
 */
public class Adjunct extends Employee
{


private double hours;
private double hrRate;

public Adjunct()
{

}

public Adjunct(String name, int hireYear, String idNum, int hours, double hrRate)
{
    setName(name);
    setHireYear(hireYear);
    setIdNum(idNum);
    this.hours = hours;
    this.hrRate = hrRate;
}

public String toString()
{
    String output = "";


    output += "Name: " + getName();
    output += "\nID Number: " + getIdNum();
    output += "\nYear Hired: " + getHireYear() + ", Years of Service: " + getServiceYears();
    output += "\nHours: " + hours + ", Hourly Rate: " + String.format("%,.2f", hrRate) + ", Salary: $" + String.format("%,.2f", hours * hrRate);

    return output;
}


public double getSalary()
{
    return hours * hrRate;
}


}
