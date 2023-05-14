/*
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/13/2023, Tyler M. Kormann v1.0
 */
public class FullTime extends Employee
{
    

private double salary = 0;

public FullTime()
{

}

public FullTime(String name, int hireYear, String idNum, double salary)
{
    setName(name);
    setHireYear(hireYear);
    setIdNum(idNum);
    setSalary(salary);
}

public String toString()
{
    String output = "";
    
    output += "Name: " + getName();
    output += "\nID Number: " + getIdNum();
    output += "\nYear Hired: " + getHireYear() + ", Years of Service: " + getServiceYears();
    output += "\nSalary: $" + String.format("%,.2f", salary);

    return output;
}

public double getSalary()
{
    return salary;
}

public void setSalary(double salary)
{
    this.salary = salary;
}


}
