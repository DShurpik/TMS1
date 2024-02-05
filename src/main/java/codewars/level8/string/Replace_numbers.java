package codewars.level8.string;

public class Replace_numbers {
    public static void main(String[] args) {
        System.out.println(dnaToRna("GCAT"));//GCAU
    }
    public static String dnaToRna(String dna) {
        return dna.replace('T', 'U');  // Do your magic!
    }
}
