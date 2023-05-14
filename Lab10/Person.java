
/*
 * Person implements Person Interface
 * @author Tyler M. Kormann
 * @version v1.0
 * @since 5/8/2023, Tyler M. Kormann v1.0
 */
public class Person implements PersonInterface
{


private String name;

public Person()
{
    name = "No Name Yet";
}

public Person(String name)
{
    this.name = name;
}

@Override
public void setName(String name)
{
    this.name = name;
}

@Override
public String getName()
{
    return name;
}

@Override
public String toString()
{
    return "Nmae: " + name;
}


}
