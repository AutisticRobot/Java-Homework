import java.io.Serializable;

/*
 * Citizen class.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/24/2023, Tyler M. Kormann, v1.0
 */
public class Citizen implements CitizenInterface, Serializable{


private String firstName;
private String lastName;

public Citizen()
{
    firstName = "No";
    lastName = "Name";
}
//@param String inFirst, input to set firstName, String inLast, input to set lastName;
public Citizen(String inFirst, String inLast)
{
    firstName = inFirst;
    lastName = inLast;
}


//Getters and setters.
@Override
public void setFirstName(String inFirst)
{
    firstName = inFirst;
}
@Override
public String getFirstName()
{
    return firstName;
}

@Override
public void setLastName(String inLast)
{
    lastName = inLast;
}
@Override
public String getLastName()
{
    return lastName;
}

@Override
public String toString()
{
    String output = "";

    output += firstName + " " + lastName;

    return output;
}


}
