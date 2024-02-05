package tms.lesson8HomeWork.Task1Ver1;

public class MonthsApp {
    public static void main(String[] args) {

        Months months = Months.January;
        Months months1 = Months.April;
        Months months2 = Months.December;

        String name = Months.January.getNameMonth();
        String name1 = Months.April.getNameMonth();
        String name2 = Months.December.getNameMonth();

        int num = Months.January.getNumMonth();
        int num1 = Months.April.getNumMonth();
        int num2 = Months.December.getNumMonth();

        System.out.println(months);
        System.out.println(months1);
        System.out.println(months2);

        System.out.println(Months.January + " " + " " + name + " " + num);
        System.out.println(Months.April + " " + " " + name1 + " " + num1);
        System.out.println(Months.December + " " + " " + name2 + " " + num2);
    }
}
