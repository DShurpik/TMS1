package codewars.level8.string;

public class Multiplication_table_for_number {
    public static void main(String[] args) {
        //System.out.println(multiTable(5));
        System.out.println(multiTable(5));
    }

    public static String multiTable(int num) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str += (String.format("%d" + " * " + "%d" + " = " + "%d", i, num, i * num));
            if(i < 10) {str += "\n";
            }
        }
        return str;
    }
    public static String multiTable1(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }
}
