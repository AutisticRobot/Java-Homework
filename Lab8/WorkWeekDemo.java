import WorkWeek.WorkEnum;

public class WorkWeekDemo {
    public static void main(String[] args) {
        WorkWeek noArgConst = new WorkWeek();

        WorkWeek begin = new WorkWeek(WorkEnum.MONDAY);
        WorkWeek mid = new WorkWeek(WorkEnum.WEDNESDAY);
    }

}
