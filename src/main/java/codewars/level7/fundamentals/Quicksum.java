package codewars.level7.fundamentals;

// https://www.codewars.com/kata/569924899aa8541eb200003f/train/java
public class Quicksum {
    public static void main(String[] args) {
        Quicksum quicksum = new Quicksum();
        System.out.println(quicksum.quicksum("ACM")); // 46
        System.out.println(quicksum.quicksum("MID CENTRAL")); // 650
        System.out.println(quicksum.quicksum("BBC")); // 15
        System.out.println(quicksum.quicksum("axg")); // 0
        System.out.println(quicksum.quicksum("234 234 WEF ASDF AAA 554211 ???? ")); // 0
        System.out.println(quicksum.quicksum("A C M")); // 75

    }

    public int quicksum(String packet){
        int sum = 0;
        for (int i = 0; i < packet.length(); i++) {
            if (packet.charAt(i) == ' ') {
                sum += 0;
            } else if (packet.charAt(i) >= 'A' && packet.charAt(i) <= 'Z') {
                int value = packet.charAt(i) - 64;
                sum += (i + 1) * value;
            } else {
                return 0;
            }
        }
        return sum;
    }
}
