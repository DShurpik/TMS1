package codewars.level8.algoritmes;

public class ExpressionsMatter {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(1,1,1));   //3
        System.out.println(expressionsMatter(2, 1, 1)); //4
        System.out.println(expressionsMatter(3, 5, 7)); //105
        System.out.println(expressionsMatter(6, 7, 1)); //48
        System.out.println(expressionsMatter(1,1,1));   //9
    }

    public static int expressionsMatter(int a, int b, int c) {
        int s1 = a * (b + c);
        int s2 = a * b * c;
        int s3 = a + b * c;
        int s4 = (a + b) * c;
        int s5 = a + b + c;
        int[] arr = new int[]{s1,s2,s3,s4,s5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int expressionsMatter1(int a, int b, int c) {
        return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
    }
}
