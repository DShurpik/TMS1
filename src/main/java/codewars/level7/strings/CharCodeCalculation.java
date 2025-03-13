package codewars.level7.strings;

public class CharCodeCalculation {
    public static void main(String[] args) {
        System.out.println(calc("abcdef")); // 6
        System.out.println(calc("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")); // 96
    }

    public static int calc(String x){
        int res = 0;
        String[] array = x.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(Integer.valueOf(array[i].charAt(0)));
        }
        String str1 = stringBuilder.toString().replaceAll("7", "1");
        for (int i = 0; i < str1.length(); i++) {
            res += Integer.valueOf(stringBuilder.charAt(i)) - Integer.valueOf(str1.charAt(i));
        }
        return res;
    }

    public static int calc1(String x) {
        return x.chars().map(c -> (int)Integer.toString(c).chars().filter(digit -> digit == '7').count()).sum()*6;
    }
}
