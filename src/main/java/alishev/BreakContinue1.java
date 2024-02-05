package alishev;

public class BreakContinue1 {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++){
            if(i == 15){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
