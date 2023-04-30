import java.util.Scanner;


public class CarpetCostDemo {
    public static void main(String[] args) {




        RoomSize tempRoom = new RoomSize("Master Room",8.3,10.5);
        CarpetCost masterRoom = new CarpetCost(tempRoom, 6.97);

        System.out.print(masterRoom.toString());
    }
    
}
