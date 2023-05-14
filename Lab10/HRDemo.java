import java.util.ArrayList; // import the ArrayList class

/*
 * 
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/13/2023, Tyler M. Kormann v1.0
 */
public class HRDemo
{
    
 
public static void main(String[] args)
{
   

FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
FullTime wilma = new FullTime();

wilma.setName("Flintstone, Wilma");
wilma.setIdNum("BR-3");
wilma.setHireYear(2015);
wilma.setSalary(78123.2468);

Employee betty = new Employee("Rubble, Betty", 2017, "BR-4");
FullTime wilma2 = new FullTime("Slate, Wilma", 2015, "BR-3", 78123.2468);

ArrayList<Person> staff = new ArrayList<Person>();
staff.add(fred);
staff.add(barney);
staff.add(wilma);
staff.add(betty);
staff.add(wilma2);

System.out.println("\n");//line break for formating
for (int i=1;i<=staff.size();i++)
{
    System.out.println("Employee " + i);
    System.out.print(staff.get(i-1).toString());
    System.out.print("\n\n");
}


System.out.println("wilma and wilma2 are the same person: " + wilma.equals(wilma2) + "\n");
if(wilma.equals(wilma2))
{
    wilma.setName("Slate, Wilma");
    staff.remove(4);
}

for (int i=1;i<=staff.size();i++)
{
    System.out.println("Employee " + i);
    System.out.print(staff.get(i-1).toString());
    System.out.print("\n\n");
}

}
}
