package codewars.level7.strings;

public class CreditCardMask {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616")); // "############5616"
        System.out.println(maskify("64607935616")); // "#######5616"
        System.out.println(maskify("1")); // 1
        System.out.println(maskify("Skippy")); // "##ippy"
        System.out.println(maskify("Nananananananananananananananana Batman!")); // "####################################man!"
    }

    public static String maskify(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 4) {
                stringBuilder.append("#");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
