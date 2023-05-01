import java.util.Scanner;


public class CarpetCostDemo {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);
    
        String name;
        double length;
        double width;
        double cost;

        System.out.print("\nEnter Room Name: ");
        name = getInput.nextLine();
        System.out.print("Enter Room Length: ");
        length = getInput.nextDouble();
        System.out.print("Enter Room Width: ");
        width = getInput.nextDouble();
        System.out.print("Enter Cost Per Square Foot: ");
        cost = getInput.nextDouble();

        RoomSize tempRoom = new RoomSize(name, length, width);
        CarpetCost masterRoom = new CarpetCost(tempRoom, cost);

        System.out.print(masterRoom.toString());


        System.out.print("\n\nEnter Room Name: ");
        name = getInput.nextLine();//for some reason, the first call for name doedsent work no matter what i do, unless it is called twice.
        name = getInput.nextLine();
        System.out.print("Enter Room Length: ");
        length = getInput.nextDouble();
        System.out.print("Enter Room Width: ");
        width = getInput.nextDouble();
        System.out.print("Enter Cost Per Square Foot: ");
        cost = getInput.nextDouble();

        CarpetCost livingRoom = new CarpetCost(new RoomSize(name, length, width), cost);
        System.out.print(livingRoom.toString());
        getInput.close();
    }
}
