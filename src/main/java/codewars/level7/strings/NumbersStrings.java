package codewars.level7.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStrings {
    public static int solve(String s){
        List<Integer> num = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                str.append(c);
            } else if (str.length() > 0) {
                num.add(Integer.parseInt(str.toString()));
                str = new StringBuilder();
            }
        }
        if (str.length() > 0) {
            num.add(Integer.parseInt(str.toString()));
        }
        List<Integer> sorted = num.stream()
                .sorted()
                .collect(Collectors.toList());
        return sorted.get(sorted.size() - 1);
    }

    public static int solve1(String s) {
        String[] arr = s.split("\\D");
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                list.add(Integer.parseInt(arr[i]));
                if (Integer.parseInt(arr[i]) > max) {
                    max = Integer.parseInt(arr[i]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int i = solve1("gh12cdy695m1"); // 695
        int j = solve1("2ti9iei7qhr5"); // 9
        System.out.println(i);
        System.out.println(j);
    }
}
