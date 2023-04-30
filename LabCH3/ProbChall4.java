import javax.swing.JOptionPane;

/**
 * ProbChall_4 asks the user to input...
 * 1) List the steps
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 2/20/2023, Tyler M. Kormann, v1.0
 */
public class ProbChall4 //Replit change to Main
{
    public static void main (String[] args)
    {
        int exam1;
        int exam2;
        int exam3;
        double avg;
        char grade = 'L';

        exam1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input exam 1"));
        exam2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input exam 2"));
        exam3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input exam 3"));

        avg = (exam1 + exam2 + exam3) / 3.0;

        if(avg >= 90){
            grade = 'A';
        }else if(avg >= 80){
            grade = 'B';

        }else if(avg >= 70){
            grade = 'C';

        }else if(avg >= 60){
            grade = 'D';

        }else if(avg <= 60){
            grade = 'F';

        }

        JOptionPane.showMessageDialog(null, "Averge score is: " + avg + "\nLetter grade: " + grade);
    }////end main
}////end class
