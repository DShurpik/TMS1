package tms.lesson11;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add(0,"Tom");
        people.add(1,"Bob");
        people.add(2,"Mark");
        people.add(3, "John");
        System.out.println(people.get(2));


        List<String> data2 = new ArrayList<>() {{
            add("Audi");
            add("WV");
            add("Lada");
        }};


    }
}
