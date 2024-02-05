package codewars.level7.mathematics;
// https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
public class IsThisTriangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,2)); // true
        System.out.println(isTriangle(7,2,2)); // false
    }

    public static boolean isTriangle(int a, int b, int c){
        return (a + b > c && a + c > b && b + c > a);
    }
}
