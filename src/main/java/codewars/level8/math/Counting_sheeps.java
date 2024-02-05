package codewars.level8.math;
/** Рассмотрим массив/список овец, где некоторые овцы могут отсутствовать на своем месте.
Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (true означает наличие).*/
public class Counting_sheeps {
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true }));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] != null && arrayOfSheeps[i])
                count++;
        }
        return count;

    }
}
