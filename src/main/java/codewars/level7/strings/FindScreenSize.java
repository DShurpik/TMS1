package codewars.level7.strings;

public class FindScreenSize {

    public static void main(String[] args) {
        System.out.println(findScreenHeight(1280,"16:9")); // "1280x720"
        System.out.println(findScreenHeight(1024,"4:3")); // "1024x768"
    }

    public static String findScreenHeight(int width, String ratio) {
        String[] ratioArr = ratio.split(":");
        int height = width * Integer.parseInt(ratioArr[1]) / Integer.parseInt(ratioArr[0]);
        return String.format("%dx%d",width, height);
    }
}
