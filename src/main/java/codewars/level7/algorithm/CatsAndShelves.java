package codewars.level7.algorithm;

public class CatsAndShelves {
    public static void main(String[] args) {
        System.out.println(solution(1, 5)); // 2
        System.out.println(solution(675, 688)); // 5
        System.out.println(solution1(268, 332)); // 22
        System.out.println(solution1(738, 758)); // 8
    }

    public static int solution(int start, int finish) {
        return (finish - start) / 3 + (finish - start) % 3;
    }

    public static int solution1(int start, int finish) {
        int count = 0;
        int distance = start;
        while (distance < finish) {
            if (distance + 3 <= finish) {
                distance += 3;
            } else {
                distance += 1;
            }
            count++;
        }
        return count;
    }
}
