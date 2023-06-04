public class Person implements PersonInterface
{

    private String name;

    public Person()
    {
        name = "TBD";
    }
    public Person(String inName)
    {
        name = inName;
    }

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
    
}
