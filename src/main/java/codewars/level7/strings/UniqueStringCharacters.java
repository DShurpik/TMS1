package codewars.level7.strings;

public class UniqueStringCharacters {
    public static String solve(String a, String b){
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            if (b.indexOf(arr1[i]) == -1) {
                str.append(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (a.indexOf(arr2[i]) == -1) {
                str.append(arr2[i]);
            }
        }
        return str.toString().trim();
    }

    public static void main(String[] args) {
        String res = solve("xyabb","xzca"); // "ybbzc"
        System.out.println(res);
    }
}
