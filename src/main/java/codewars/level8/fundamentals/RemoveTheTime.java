package codewars.level8.fundamentals;

public class RemoveTheTime {
    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 9am"));
    }

    public static String shortenToDate(String longDate) {
        String[] arr = longDate.split(",");
        return arr[0].toString();
    }

    public static String shortenToDate1(String longDate) {
        return longDate.substring(0, longDate.indexOf(','));
        //В Java метод substring() класса String используется для извлечения подстроки из строки.
    }
}
