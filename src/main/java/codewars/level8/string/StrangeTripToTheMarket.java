package codewars.level8.string;

public class StrangeTripToTheMarket {
    //https://www.codewars.com/kata/55ccdf1512938ce3ac000056/train/java

    public static void main(String[] args) {

    }

    public static boolean isLockNessMonster(String s){
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        return s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty");
    }
}
