package codewars.level7.strings;
// https://www.codewars.com/kata/59377c53e66267c8f6000027/train/java

public class AlphabetWar {
    public static void main(String[] args) {
        System.out.println(alphabetWar("z")); // "Right side wins!"
        System.out.println(alphabetWar("zdqmwpbs")); // "Let's fight again!"
        System.out.println(alphabetWar("zzzzs")); // "Right side wins!"
        System.out.println(alphabetWar("wwwwwwz")); // "Left side wins!"
    }

    public static String alphabetWar(String fight){
        int countRight = 0;
        int countLeft = 0;
        for (int i = 0; i < fight.length(); i++) {
            char grade = fight.charAt(i);
            switch (grade) {
                case 'w' : countLeft = countLeft + 4; break;
                case 'p' : countLeft = countLeft + 3; break;
                case 'b' : countLeft = countLeft + 2; break;
                case 's' : countLeft = countLeft + 1; break;
                case 'm' : countRight = countRight + 4; break;
                case 'q' : countRight = countRight + 3; break;
                case 'd' : countRight = countRight + 2; break;
                case 'z' : countRight = countRight + 1; break;
                default: continue;
            }
        }
        return countRight > countLeft ? "Right side wins!" : countRight < countLeft ? "Left side wins!" : "Let's fight again!";
    }
}
