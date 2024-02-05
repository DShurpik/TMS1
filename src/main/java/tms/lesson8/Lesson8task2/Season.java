package tms.lesson8.Lesson8task2;

public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    String seasonValue;
    Season(String seasonValue){
        this.seasonValue = seasonValue;

    }

    protected String seasoninfo(){
        return seasonValue;
    }
}
