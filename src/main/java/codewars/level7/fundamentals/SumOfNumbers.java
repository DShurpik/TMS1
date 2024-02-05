package codewars.level7.fundamentals;
// https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763/train/java

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(showSequence(6)); // "0+1+2+3+4+5+6 = 21"
        System.out.println(showSequence(-1));
    }

    public static String showSequence(int value){
        if (value == 0) return "0=0";
        if (value < 0) return value + "<0";
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            sum = sum + i;
            if (i < value) {
                stringBuilder.append(i).append("+");
            } else {
                stringBuilder.append(i);
            }
        }
        return stringBuilder.append(" = ").append(sum).toString();
    }
}
