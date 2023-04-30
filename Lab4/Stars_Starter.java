import javax.swing.JOptionPane;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 3/5/2023, Tyler M. Kormann, v1.0
 */

public class Stars_Starter{ 
    public static void main (String args[]){
        ////vars section
        //String temp for JOptionPane input
        String temp;
        int width , line, spaces, stars;
        //JOptionPane to get user input, something like "Enter max width for stars"
        temp = JOptionPane.showInputDialog(null, "Enter max width for stars.");
        //convert input string to int and set to width
        width = Integer.parseInt(temp);
        //test to see if width is even (width%2==0).  If true increment width by 1.  Ensures width is an odd number
        if(width % 2 == 0){ width++; }

        ////top half section
        for (line=1,spaces=width/2;line<=(width/2)+1;line++,spaces--){ ////how many lines should be based on width
            for (int i=0;i<=spaces;i++){  //this is for spaces
                System.out.print(" ");
            }
            for (stars=1;stars<=line*2-1;stars++){  //this is for stars
                System.out.print("*");
            }
            System.out.println("");  //this gets to next line
        }

        ////bottom half
        for (line=width/2,spaces=1;line>0;line--,spaces++){  //lines start one less than largest line in top half, go down, based on width
            for (int i=0;i<=spaces;i++){  //this is for spaces
                System.out.print(" ");
            }
            for (stars=line*2-1;stars>=1;stars--){  //this is for stars
                System.out.print("*");
            }
            System.out.println("");  //this gets to next line
        }
        System.exit(0);  //Kills JOptionPane GUI thread
    }  ////end main()
} ////end class