
/*
 * CitizenInterface is an Interface for citizen class.
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/24/2023, Tyler M. Kormann, v1.0
 */
public interface CitizenInterface {
    

String firstName = "";
String lastName = "";


//@param String, inFirst; input name to set firstname var;
public void setFirstName(String inFirst);
//@return, returns vat firstName;
public String getFirstName();
//@param String, inLast; input name to set lastname var;
public void setLastName(String inLast);
//@return, returns vat lastName;
public String getLastName();
//@return, returns the class as a String.
public String toString();


}
