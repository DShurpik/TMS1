package codewars.level7.strings;

public class ReplaceEveryNth {
    public static void main(String[] args) {
        System.out.println(replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
        //"Vader soid: No, I am your fother!"
        System.out.println(replaceNth("Vader said: No, I am your father!", 1, 'i', 'y'));
        //"Vader sayd: No, I am your father!"
        System.out.println(replaceNth("Luke cries: Noooooooooooooooo!", 6, 'o', 'i'));
        // "Luke cries: Noooooioooooioooo!"
    }

    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        if (n <= 0) return text;
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = text.toCharArray();
        int count = 0;
        for (char c : arr) {
            if (c == oldValue) count++;
            if (c == oldValue && count == n) {
                stringBuilder.append(newValue);
                count = 0;
            }
            else stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
