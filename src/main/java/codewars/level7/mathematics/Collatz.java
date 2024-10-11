package codewars.level7.mathematics;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public static void main(String[] args) {
        System.out.println(conjecture(20)); // 8
    }

    public static long conjecture(long x) {
        List res = new ArrayList();
        res.add(x);
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
                res.add(x);
            } else {
                x = x * 3 + 1;
                res.add(x);
            }
        }
        return res.size();
    }
}
