package codewars.level7.strings;

public class ChangingLetters {
    public static String swap(String st){
        StringBuilder str = new StringBuilder();
        String regex = "[aeiou]";
        for (int i = 0; i < st.length(); i++) {
            if (String.valueOf(st.charAt(i)).matches(regex)) {
                str.append(String.valueOf(st.charAt(i)).toUpperCase());
            } else {
                str.append(st.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String result = swap("HelloWorld!");
        System.out.println(result);
    }
}
