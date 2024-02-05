package codewars.level7.mathematics;
// https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
public class CountTheDivisorsOfNumber {
    public static void main(String[] args) {
        CountTheDivisorsOfNumber countTheDivisorsOfNumber = new CountTheDivisorsOfNumber();
        System.out.println(countTheDivisorsOfNumber.numberOfDivisors(1224));
        System.out.println(countTheDivisorsOfNumber.numberOfDivisors(30));
    }

    public long numberOfDivisors(int n) {
        long count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
