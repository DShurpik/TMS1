package alishev;

public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if(i == 15){
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n" + "we exit from cycle");
    }
}
