package codewars.level8.string;

import java.util.Arrays;

public class Check_is_object_in_arr {
    public static void main(String[] args) {
        System.out.println(check(new Object[] {66, 101}, 66));//true
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));//true
        System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"));//false

        System.out.println(check1(new Object[] {66, 101}, 66));//true
        System.out.println(check1(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));//true
        System.out.println(check1(new Object[] {"what", "a", "great", "kata"}, "kat"));//false
    }
    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static boolean check1(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
