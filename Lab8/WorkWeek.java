public class WorkWeek {
    private WorkEnum day;

    public WorkWeek()
    {
        day = WorkEnum.MONDAY;
    }

    public WorkWeek(WorkEnum day)
    {
        this.day = day;
    }

    public void daysAreSame(WorkWeek inWorkWeek)
    {
        if(day.equals(inWorkWeek))
        {
            System.out.println("the days are the same");
        }else{

            System.out.println("the days are not the same");
        }
    }

    //@return Prints weather prameter day is before, the same, or after the exec object day.
    public void compareDays(WorkWeek inWorkWeek)
    {
        if(day.compareTo(inWorkWeek.getDay())>0)
        {
            System.out.println(day + " is after " + inWorkWeek.getDay());
        }else if(day.compareTo(inWorkWeek.getDay())==0){
            System.out.println(day + " is the same day as " + inWorkWeek.getDay());

        }else{
            System.out.println(day + " is before " + inWorkWeek.getDay());
        }
    }

    public void printDay()
    {
        System.out.println(day);
    }

    public WorkEnum getDay()
    {
        return day;
    }
}
