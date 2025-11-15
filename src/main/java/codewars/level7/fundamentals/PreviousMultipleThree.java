package codewars.level7.fundamentals;

public class PreviousMultipleThree {

    public static void main(String[] args) {
        System.out.println(prevMultOfThree(36));    // 36
        System.out.println(prevMultOfThree(1244));  // 12
        System.out.println(prevMultOfThree(25));    // null
        System.out.println(prevMultOfThree(952406));// 9
    }

    public static Integer prevMultOfThree(int n){
        if (n % 3 == 0) return n;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int f = Integer.parseInt(s.substring(0, s.length() - i));
            if (f % 3 == 0) return f;
        }
        return null;
    }
}
