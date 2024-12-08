package codewars.level7.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class FriendOrFoe {
    public static void main(String[] args) {
        System.out.println(friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
        System.out.println(friend(List.of("Peter", "Stephen", "Joe")));

        System.out.println(friend1(List.of("Ryan", "Kieran", "Jason", "Yous")));
        System.out.println(friend1(List.of("Peter", "Stephen", "Joe")));
    }

    public static List<String> friend(List<String> x) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).length() == 4) {
                res.add(x.get(i));
            }
        }
        return res;
    }

    static List<String> friend1(List<String> names) {
        return names.stream().filter(s -> s.length() == 4).toList();
    }
}
