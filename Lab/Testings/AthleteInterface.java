

/**
 * Interface for Athlete class
 *
 * @author Rico Cassoni, richard.cassoni@gcccd.edu
 * @since 5/19/2022
 * @version v1.1
 */
public interface AthleteInterface extends Comparable {

    /**
     * Method for obtaining input and output names and setting to inputFile and
     * outputFile String instance vars.
     */
    public void setFileNames();

    /**
     * Takes in csv file and produces an Athlete []
     *
     * @return Athlete[] for processing
     */
    public Athlete[] csv2Array();

    /**
     * Setter for event name
     *
     * @param eventName sets event name
     */
    public void setEventName(String eventName);
    
    /**
     * Takes in an Athlete[] and String input to print out to file
     * After printing the message per the inMsg param, Athlete and Event
     * Name are printed out as headers for the name and event columns
     *
     * @param inArray array for storing Athlete objects
     * @param inMsg String message printed the line above inArray
     */
    public void printArray2File(Athlete[] inArray, String inMsg);
    
    /**
     * CompareTo to be used in sorting Athlete[]'s
     *
     * @param o Passed in Object for comparing with calling object
     * @return -1,0,1
     */
    public int compareTo(Object o);
    
    /**
     * @return prints out name, a tab, and then the event
     */
    public String toString();
}
