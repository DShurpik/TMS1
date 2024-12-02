package codewars.level8.math;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(1705));//18
        System.out.println(century(1900));//19
        System.out.println(century(1601));//17
        System.out.println(century(2000));//20
        System.out.println(century(89));//1
    }
    public static int century(int number) {
        //return (number - 1) / 100 + 1;
        return (number + 99) / 100;
    }
}
