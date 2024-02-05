package codewars.level7.strings;

public class LongestVowelChain {
    public static int solve(String s){
        String vowels = "aeiou";
        int count = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou");
        System.out.println(result); // 11
    }
}
