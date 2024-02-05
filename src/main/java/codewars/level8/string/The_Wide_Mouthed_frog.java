package codewars.level8.string;

public class The_Wide_Mouthed_frog {
    public static void main(String[] args) {
        System.out.println(mouthSize("toucan"));
        System.out.println(mouthSize("ant bear"));
        System.out.println(mouthSize("alligator"));
    }


    public static String mouthSize(String animal){
        return animal.equals("alligator") || animal.equals("ALLIGATOR") ? "small" : "wide";

        //return animal.equalsIgnoreCase("alligator") ? "small" : "wide";

        //return "alligator".equals(animal.toLowerCase()) ? "small" : "wide";
    }
}
