package tms.lesson10.Task2MaxMinStringArr;

public class TestStr {
    //        example6ForStr();
//        example5ForStr();
//        example4ForStr();
//        example3ForStr();
//        example2ForStr();
//        example1ForStr();


    private static void example6ForStr(){
        StringBuilder builder = new StringBuilder("Hello world!");
        builder.replace(6, builder.length() - 1, "Java");
        System.out.println(builder);
    }

    private static void example5ForStr() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("word!?222");
        // 012345678

        // Если удалять много символов
        stringBuilder.delete(5,9);
        // Если удаляем один, то этот
        stringBuilder.deleteCharAt(4);
        stringBuilder.insert(3,"l");

        System.out.println(stringBuilder);
    }

    //Здесь как надо склеивать строки
    private static void example4ForStr(){
        StringBuilder smallString = new StringBuilder("Параметр ");
        smallString.append("Рабочее название");

        for (int i = 0; i < 10; i++) {
            smallString.append(i);
        }
        System.out.println(smallString);
    }
    //Получение подстроки
    private static void example3ForStr(){
        String text = "Объевления Владелец Имя Иванов Цена 3000";

        System.out.println(text.substring(text.length() - 4));
    }

    //Проверка вхождения подстроки
    private static void example2ForStr(){
        String full = "123Полная";
        String notFull = "Пол";
        System.out.println(full.indexOf(notFull));
    }

    //Как не надо склеивать строки
    private static void example1ForStr(){
        String smallString = "Рабочее название";

        for (int i = 0; i < 10; i++) {
            smallString = smallString + i;
        }
        int number = 123123;
        String numberStr = String.valueOf(number);
        System.out.println(smallString.charAt(2));
        System.out.println(smallString.toLowerCase());
        System.out.println(smallString.toUpperCase());
    }

}
