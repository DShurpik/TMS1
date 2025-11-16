package codewars.level7.arrays;

public class TheOfficeBrokenPhotocopier {

    public static void main(String[] args) {
        System.out.println(broken("10000000101101111110011001000"));
        System.out.println(broken("1"));
    }

    public static String broken(final String x) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1') stringBuilder.append("0");
            else stringBuilder.append("1");
        }
        return stringBuilder.toString();
    }

    public static String broken1(final String x) {
        return x.replace("0"," ").replace("1","0").replace(" ","1");
    }
}
