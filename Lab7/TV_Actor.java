public class TV_Actor {
    private String name;
    private String show;

    //Constructors
    public TV_Actor()
    {
        name = "Unknown Name";
        show = "Unknown Show";
    }
    public TV_Actor(String inName, String inShow)
    {
        name = inName;
        show = inShow;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getShow() {
        return show;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setShow(String show) {
        this.show = show;
    }

    public String toString() {
        String output = "Name: " + name + ", Show: " + show;
        return output;
    }
}
