package codewars.level8.string;
/** https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0 */
/** Удалить первый знак в строке */
public class RemoveFirstLastCharacter {
    public static void main(String[] args) {
        String str = "Hello";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.delete(0,1).delete(stringBuilder.length() -1, stringBuilder.length());


        System.out.println(stringBuilder.toString() + " By string builder");
        System.out.println(str.substring(1, str.length() - 1));
    }
}
