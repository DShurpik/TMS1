package codewars.level7.arrays;

public class CleanAfterYourDog {
    public static void main(String[] args) {
        System.out.println(crap(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 2, 2)); // Clean
        System.out.println(crap(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 1, 1)); // Cr@p
        System.out.println(crap(new char[][]{{'_', '_'}, {'_', '@'}, {'D', '_'}}, 2, 2)); // Dog!!
    }

    public static String crap(char[][] garden, int bags, int cap) {
        int count = 0;
        for (char[] chars : garden) {
            for (char aChar : chars) {
                if (aChar == '@') {
                    count++;
                } else if (aChar == 'D') {
                    return "Dog!!";
                }
            }
        }
        return bags * cap >= count ? "Clean" : "Cr@p";
    }
}
