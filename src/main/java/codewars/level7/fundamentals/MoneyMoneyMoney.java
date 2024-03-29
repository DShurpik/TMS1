package codewars.level7.fundamentals;
// https://www.codewars.com/kata/563f037412e5ada593000114/train/java

public class MoneyMoneyMoney {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.05,0.18,1100)); // 3
        System.out.println(calculateYears(1000,0.01625,0.18,1200)); // 14
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        if (principal >= desired) return 0;
        int years = 0;
        while (principal < desired) {
            double interestEarned = principal * interest;
            double taxPaid = interestEarned * tax;
            principal += interestEarned - taxPaid;
            years++;
        }
        return years;
    }
}
