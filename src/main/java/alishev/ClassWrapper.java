package alishev;

public class ClassWrapper {
    public static void main(String[] args) {
        int x = 1;

        Integer x1 = 123;// Java самостоятельно упаковывает примитив в класс обертку, автоупаковка
        Integer x2 = new Integer(123);

        Integer y1 = 123;// Упаковали в класс обертку
        int y2 = y1; // Произошла авторасспаковка из класса обертки в примитивный кдасс инт

        System.out.println(x + x1);

        System.out.println(Integer.parseInt("123"));



        // Double, Float, Long, Integer, Short, Byte, Character, Boolean: КЛАССЫ ОБЕРТКИ ПРИМИТИВНЫХ ТИПОВ ДАННЫХ



    }
}
