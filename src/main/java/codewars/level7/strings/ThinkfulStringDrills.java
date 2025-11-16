package codewars.level7.strings;

public class ThinkfulStringDrills {

    public static void main(String[] args) {
        System.out.println(quotable("Grae", "Practice makes perfect"));
        System.out.println(quotable("Dan", "Get back to work, Grae"));
        System.out.println(quotable("Alex", "Ruby is great fun"));
    }

    public static String quotable(String name, String quote){
        return String.format("%s said: \"%s\"", name, quote);
    }
}
