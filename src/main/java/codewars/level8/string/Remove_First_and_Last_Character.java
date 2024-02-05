package codewars.level8.string;
/** https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0 */
/** Удалить первый знак в строке */
public class Remove_First_and_Last_Character {
    public static void main(String[] args) {
        String str = "Hello Java!";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.delete(0,1).delete(stringBuilder.length() -1, stringBuilder.length());
        //return stringBuilder.toString();
        System.out.println(stringBuilder.toString());
    }
}
