public class RoomSize {
    
    private String name;
    private double length;
    private double width;

    public RoomSize()
    {
        name = "Unkown";
        length = 0;
        width = 0;
    }
    public RoomSize(String inName, double inLen, double inWidth)
    {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    public double getArea()
    {
        return length * width;
    }

    public String toString()
    {
        String output = "";
        output += "\nRoom Name: "+ name;
        output += String.format("\nRoom Length: %,.2fft", length);
        output += String.format("\nRoom Width: %,.2fft", width);

        return output;

    }
}
