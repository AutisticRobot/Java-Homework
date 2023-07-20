/**
 * PersonInterface for creating base class.
 *
 * @author Rico Cassoni, richard.cassoni@gcccd.edu
 * @since 5/19/2022
 * @version v1.1
 */
public interface PersonInterface {

    /**
     * Getter for name
     * @return name
     */
    public String getName();

    /**
     * Setter for name
     * @param name inputted name
     */
    public void setName(String name);
    
    /**
     * @return output prints out name
     */
    public String toString();
}
