package alishev.abstractaclass.hw12;

public final class Month {
    private final String name;
    private final int countWorkDays;
    private final int countDays;

    public Month(String name, int countDays, int countWorkDays) {
        this.name = name;
        this.countWorkDays = countWorkDays;
        this.countDays = countDays;
    }

    public String getName() {
        return name;
    }

    public int getCountWorkDays() {
        return countWorkDays;
    }

    public int getCountDays() {
        return countDays;
    }
}
