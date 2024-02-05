package codewars.level8.math;

public class GetNthEvenNumber {
    public static void main(String[] args) {
        System.out.println(nthEven(100)); // 198
        System.out.println(nthEven(1298734)); // 2597466
        System.out.println(nthEven(3)); // 4
        System.out.println("-----------");
        System.out.println(nthEven1(100));
        System.out.println(nthEven1(1298734));
        System.out.println(nthEven1(3));
    }


    public static int nthEven(int n) {
        return n * 2 - 2;
    }

    public static int nthEven1(int n) {
        return ( n - 1 ) * 2;
    }

}
