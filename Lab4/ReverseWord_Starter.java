import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 3/5/2023, Tyler M. Kormann, v1.0
 */

public class ReverseWord_Starter{ //Change to Main for Replit
    public static void main (String[] args){
        ////vars section
        String word, remaining, combined = "", flipped;
        char firstLetter;

        //Create Scanner object to get input
        Scanner getInput = new Scanner(System.in);
        word = getInput.next().toLowerCase();
        while(!word.equalsIgnoreCase("quit"))
        {  ////optional do while.  Get main program up and running and then the do while
            ////this program allows for adding all words with quit as last word
            ////you can get the first word using .next() and forcing .toLowerCase();
            ////Since we don't know how many words, best to use a while. Create while loop (pit) looking
            //on each pass through the while loop, clear combined and flipped 
            flipped = combined = "";
            //(ie combined = "";)  NOTE-This is 2 "s without a space.
            
            //get firstLetter
            firstLetter = word.charAt(0);
            remaining = word.substring(1);
            //get remaining, think substring here
            //set combined to remaining + firstLetter
            combined = remaining + firstLetter;
            //for loop to reverse combined and set to flipped.  Start with right most letter (char)
            //  in combined and add char to flipped, decrement for loop, and stop when no more 
            //  chars left (when you reach 0)
            //  use something like this in the for loop, flipped+=combined.charAt(i);
            for(int i = combined.length() - 1; i >= 0; i--)
            {
                flipped += combined .charAt(i);
            }
            //Test to see if flipped is same as word.  HINT-Since strings, must use equals()
                ////Print out <word> works
            //else
                ////Print out <word> does not work
            if(flipped.equalsIgnoreCase(word))
            {
                System.out.println(word + " does work");
            }else{
                System.out.println(word + " does not work");
            }
            //get next word that while boolean will test (HINT-use same statement just before while loop)
            word = getInput.next().toLowerCase();
            ////Optional do while, print msg to process another line (ie type yes)
        }// to see if desired input was word to repeat, .use equalsIgnoreCase());
        getInput.close();
    }////end main ()
}////end class