package codewars.level7.strings;

public class SpoonerizeMe {

    public static void main(String[] args) {
        System.out.println(spoonerize("not picking"));
    }

    public static String spoonerize(String words) {
        String[] arr = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        char temp = arr[0].charAt(0);
        char temp1 = arr[arr.length - 1].charAt(0);
        stringBuilder.append(temp1).append(arr[0].substring(1)).append(" ")
                .append(temp).append(arr[arr.length - 1].substring(1));
        return stringBuilder.toString();
    }

    public static String spoonerize1(String words) {
        String[] word = words.split(" ");
        return word[1].substring(0, 1) + word[0].substring(1) + " " + word[0].substring(0, 1) + word[1].substring(1);
    }
}
