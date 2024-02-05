package codewars.level7.strings;

// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java
public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("AAAA")); // TTTT
        System.out.println(makeComplement("ATTGC")); // TAACG
    }

    public static String makeComplement(String dna) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') stringBuilder.append('T');
            else if (dna.charAt(i) == 'T') stringBuilder.append('A');
            else if (dna.charAt(i) == 'C') stringBuilder.append('G');
            else if (dna.charAt(i) == 'G') stringBuilder.append('C');
        }
        return stringBuilder.toString();
    }
}
