package tms.lesson8HomeWork.Task1Ver2;

public enum Months {
    January(1, "Январь"),
    February(2, "Февраль"),
    March(3, "Март"),
    April(4, "Апрель"),
    May(5, "Май"),
    June(6, "Июнь"),
    July(7, "Июль"),
    August(8, "Август"),
    September(9, "Сентябрь"),
    October(10, "Октябрь"),
    November(11, "Ноябрь"),
    December(12, "Декабрь");

    int numMonth;
    String nameMonth;

    Months(int inputNumMonth, String inputNameMonth) {
        numMonth = inputNumMonth;
        nameMonth = inputNameMonth;
    }
    public static String getValue(int scanPar){
        Months[] months = Months.values();
        for (int i = 0; i < months.length; i++) {
            if (months[i].numMonth == scanPar) {
                return months[i].nameMonth;
            }
        }
        return null;
    }
}
