package codewars.level7.fundamentals;

public class NumbersLetters {
    public static void main(String[] args) {
        System.out.println(switcher(new String[]{"24", "12", "23", "22", "4", "26", "9", "8"})); // "codewars"
        System.out.println(switcher(new String[]{"12","28","25","21","25","7","11","22","15"}));
    }

    public static String switcher(String[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("27")) stringBuilder.append("!");
            else if (arr[i].equals("28")) stringBuilder.append("?");
            else if (arr[i].equals("29")) stringBuilder.append(" ");
            else stringBuilder.append((char) ('z' - (Integer.parseInt(arr[i]) - 1)));
        }
        return stringBuilder.toString();
    }
}
