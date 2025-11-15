package codewars.level7.fundamentals;

public class SeeYouNextHappyYear {
    public static void main(String[] args) {
        System.out.println(nextHappyYear(1001)); // 1023
        System.out.println(nextHappyYear(1123)); // 1203
        System.out.println(nextHappyYear(2001)); // 2013
        System.out.println(nextHappyYear(2334)); // 2340
    }

    static public int nextHappyYear(int year) {
        int result = 0;
        for (int k = year + 1; k <= 10000; k++) {
            String yearStr = String.valueOf(k);
            boolean isHappyYear = true;
            for (int i = 0; i < yearStr.length(); i++) {
                for (int j = i + 1; j < yearStr.length(); j++) {
                    if (yearStr.charAt(i) == yearStr.charAt(j)) {
                        isHappyYear = false;
                        break;
                    }
                }
                if (!isHappyYear) {
                    break;
                }
            }
            if (isHappyYear) {
                result = k;
                break;
            }
        }
        return result;
    }

    static public int nextHappyYear1(int year) {
        while (String.valueOf(++year).chars().distinct().count() != 4) ;
        return year;
    }
}
