package tms.lesson8.task3;

public enum DayWeeks {
    MONDAY(1,"Понедельник"), //Объекты
    TUESDAY(2, "Вторник"),
    WEDNESDAY(3, "Среда"),
    THURSDAY(4,"Четверг"),
    FRIDAY(5,"Пятница"),
    SATURDAY(6,"Суббота"),
    SUNDAY(7,"Воскресенье");
    int numberOfDayWeek; // Свойства объектов
    String nameOfDayWeek;

    //Конструктор
    DayWeeks(int inputDayNumbers, String inputNameOfDayWeek){
        numberOfDayWeek = inputDayNumbers;
        nameOfDayWeek = inputNameOfDayWeek;
    }
    //Статичный метод к которому обращаться только через класс DayWeeks
    public static String getValueOfDayWeekByNumber(int parametrFromScanner){
        DayWeeks[] dayWeeks = DayWeeks.values();
        for(int i = 0; i < dayWeeks.length; i++){
            if(dayWeeks[i].numberOfDayWeek == parametrFromScanner){
                return dayWeeks[i].nameOfDayWeek;
            }
        }
        return null;
    }
}
