package codewars.level7.fundamentals;

public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind){
        StringBuilder str = new StringBuilder();
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if (index < ind.length && i == ind[index]) {
                str.append(Character.toUpperCase(s.charAt(i)));
                index++;
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String result = capitalize("abcdef", new int[]{1,2,5});
        System.out.println(result);
        String result1 = capitalize("codewarriors", new int[]{5});
        System.out.println(result1);
    }
}
