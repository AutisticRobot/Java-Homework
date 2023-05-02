public class WorkWeekDemo {
    public static void main(String[] args) {
        WorkWeek noArgConst = new WorkWeek();

        WorkWeek begin = new WorkWeek(WorkEnum.MONDAY);
        WorkWeek mid = new WorkWeek(WorkEnum.WEDNESDAY);

        System.out.print("\n\n");

        noArgConst.daysAreSame(begin);
        noArgConst.daysAreSame(mid);

        noArgConst.compareDays(begin);

        begin.compareDays(mid);
        mid.compareDays(begin);
        mid.printDay();

        System.out.print("\n\n");

    }

}
