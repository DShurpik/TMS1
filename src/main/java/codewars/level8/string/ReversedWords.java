package codewars.level8.string;

public class ReversedWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }
    public static String reverseWords(String str){
        String[] arr = str.split(" ");
        String[] newArr = new String[arr.length];
        int j = newArr.length - 1;
        for (int i = 0; i < arr.length; i++){
            newArr[j] = arr[i];
            j--;
        }
        String arr1 = String.join(" ", newArr);

        return arr1;
    }
}
