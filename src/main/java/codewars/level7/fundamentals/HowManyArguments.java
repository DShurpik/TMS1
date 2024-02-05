package codewars.level7.fundamentals;

import java.math.BigInteger;

public class HowManyArguments {
    public static void main(String[] args) {
        System.out.println(countArgs('a', 865, "asfhgajsf", new BigInteger("123456"))); // 4
        System.out.println(countArgs(1, 2, 3)); // 3
    }

    public static int countArgs(Object... args) {
        return args.length;
    }
}
