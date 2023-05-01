/*
 * CarpetCost 
 */

public class CarpetCost {
    private RoomSize size = new RoomSize();
    private double costPerSqFt;

    public CarpetCost(RoomSize area, double cost)
    {
        size = area;
        costPerSqFt = cost;
    }

    public double getCost()
    {
        return size.getArea() * costPerSqFt;
    }

    public String toString()
    {
        String output = size.toString();
        output += String.format("\nCost Per Square Foot: %,.2f", costPerSqFt);
        output += String.format("\nTotal Cost: %,.2f", getCost());
        return output;
    }

}
