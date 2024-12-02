package codewars.level8.array;

public class ToSquareOrNotToSquare {
    public static void main(String[] args) {
        /**
         *  Проверка элементов массива, если есть целочисленный квадратный корень то в новый массив
         *  добавляем значение корня.
         *  Если нету корня, то возводим в квадрат
         *
         * */
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (Math.sqrt(input[i]) % 1 == 0) {
                output[i] = (int) Math.sqrt(input[i]);
            } else {
                output[i] = input[i] * input[i];
            }
        }


    }


}
