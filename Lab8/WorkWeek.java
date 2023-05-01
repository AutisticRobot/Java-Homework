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

    public void compareDays(WorkWeek inWorkWeek)
    {
        if(day.compareTo(inWorkWeek.getDay())>0)
        {
            System.out.print("Case 1");
        }else if(day.compareTo(inWorkWeek.getDay())==0){
            System.out.print("Case 0");
        }else{
            System.out.print("Case -1");
        }
    }

    public void printDay()
    {
        System.out.print(day);
    }

    public WorkEnum getDay()
    {
        return day;
    }
}
