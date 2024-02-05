package codewars.level7.algorithm;

public class GrowingPlant {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int growing = 0;
        int count = 0;
        while (growing < desiredHeight) {
            count++;
            growing = growing + upSpeed;
            if (growing >= desiredHeight) {
                break;
            }
            growing = growing - downSpeed;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = growingPlant(100, 10, 910);
        int j = growingPlant(10,  9,   4);
        System.out.println(i);
        System.out.println(j);
    }
}
