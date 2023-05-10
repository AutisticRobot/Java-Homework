

/*
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/8/2023, Tyler M. Kormann v1.0
 */
public class Employee extends Person
{


private int hireYear;
private String idNum;  
    

//constructors
public Employee()
{
    super();
    hireYear = 0;
    idNum = "onboarding";
}

public Employee(String name, int hireYear, String idNum)
{
    super(name);
    this.hireYear = hireYear;
    this.idNum = idNum;
}

//based on idNum - a unique entry in a fictional database
public boolean equals (Object o)
{
    boolean isEqual = false;
    if (o != null && getClass()==o.getClass())
    {
        Employee copy = (Employee)o;
        if (idNum.equalsIgnoreCase(copy.idNum))
        {
            isEqual = true;
        }
    }
    return isEqual;
}

public int getServiceYears()
{
    return CURRENT_YEAR - hireYear;
}

public 
}
