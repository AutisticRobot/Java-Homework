import java.util.ArrayList;
/**
 * Write a description of class TV_ActorDemo here.
 * 1) Write steps here
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 4/18/2023
 */


public class TV_ActorDemo_Starter{ // Change to Main in Replit and rename file to Main.java
    public static void main(String[] args) {
        //create TV_Actor ArrayList called list
        ArrayList<TV_Actor> list = new ArrayList<>();
        //add TV_Actor Bart, The Simpsons.  Can first create TV_Actor and then add or put the TV_Actor constructor call in the add()
        list.add(new TV_Actor("Bart", "The Simpsons"));
        //add TV_Actor Maggie, The Simpsons
        list.add(new TV_Actor("Maggie", "The Simpsons"));
        //add TV_Actor Lisa, The Simpsons
        list.add(new TV_Actor("Lisa", "The Simpsons"));
        printArrayList(list);
        //remove Maggie (item 1 from the list)
        list.remove(1);
        printArrayList(list);
            //set item 1 to new TV_Actor, Butthead, B&B
        list.set(1, new TV_Actor("Butthead", "B&B"));
        printArrayList(list);
            //add new item TV_Actor Beavis,B&B to item 1
        list.add(1, new TV_Actor("Beavis", "B&B"));
        printArrayList(list);
            //remove TV_Actor at index 0
        list.remove(0);
        printArrayList(list);
    }//end main()
    
    public static void printArrayList(ArrayList<TV_Actor> inList){
        System.out.println("Printing ArrayList<TV_Actor> list");
        int actorNumber=0;
        for (TV_Actor entry:inList){
            System.out.println("Actor " + actorNumber + " " + entry);
            actorNumber++;
        }
        System.out.println();
    }//end printArrayList
    
}//end TCV_ActorDemo
