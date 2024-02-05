package codewars.level7.strings;

public class RemoveConsecutiveDuplicateWords {
    public static void main(String[] args) {
        String s1 = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        System.out.println(removeConsecutiveDuplicates(s1));
        String s2 = "cyqje cyqje cyqje a a a";
        System.out.println(removeConsecutiveDuplicates(s2));
    }

    public static String removeConsecutiveDuplicates(String s){
        String[] arr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                stringBuilder.append(" " + arr[i]);
            }
        }
        return stringBuilder.toString();
    }
}
