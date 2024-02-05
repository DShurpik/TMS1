package tms.lesson8HomeWork.Task1Ver1;


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

        private int numMonth;
        private String nameMonth;

        Months(int inputNumMonth, String inputNameMonth) {
            numMonth = inputNumMonth;
            nameMonth = inputNameMonth;
        }

        protected int getNumMonth(){
            return numMonth;
        }
        protected String getNameMonth(){
            return nameMonth;
        }
    }

