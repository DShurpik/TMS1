package codewars.level8.math;

public class SurfaceAreaAndVolumeOfABox {
    public static void main(String[] args) {
        int[] a = getSize(4, 2, 6);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] getSize(int w,int h,int d) {
        int area = 2 * (w * h + h * d + d * w);
        int volume = w * h * d;
        return new int[] {area, volume};
    }
}
