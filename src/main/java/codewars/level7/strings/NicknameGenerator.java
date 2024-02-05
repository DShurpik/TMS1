package codewars.level7.strings;

public class NicknameGenerator {
    public static void main(String[] args) {
        System.out.println(nickname("Jimmy")); // Jim
        System.out.println(nickname("Samantha")); // Sam
        System.out.println(nickname("Sam")); // "Error: Name too short"
        System.out.println(nickname("Jeannie")); // Jean
    }

    public static String nickname (String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        } else if (String.valueOf(name.charAt(2)).matches("[^aeiouAEIOU]")){
            return name.substring(0,3);
        } else {
            return name.substring(0,4);
        }
    }

    public static String nickname1 (String name) {
        if(name.length() < 4) return "Error: Name too short";
        return name.matches("^.{2}[euoai].+$") ? name.substring(0, 4) : name.substring(0, 3);
    }
}
