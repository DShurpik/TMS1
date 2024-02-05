package codewars.level7.strings;

public class Spacify {
    public static String spacify(String str){
        StringBuilder strbuild = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            strbuild.append(str.charAt(i)).append(" ");
        }
        return strbuild.toString().trim();
    }

    public static void main(String[] args) {
        String s = spacify("Hello world");
        System.out.println(s);
    }
}
