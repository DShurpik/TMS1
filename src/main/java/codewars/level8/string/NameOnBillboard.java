package codewars.level8.string;

public class NameOnBillboard {
    // https://www.codewars.com/kata/570e8ec4127ad143660001fd/train/java
    public static void main(String[] args) {
        System.out.println(billboard("Dzmitry Shurpik", 20));
    }

    public static int billboard(String name, int price) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum = sum + price;
        }
        return sum;
    }
}
