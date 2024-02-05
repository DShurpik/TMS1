package alishev;

public class StringBuilderTask {
    public static void main(String[] args) {
        String workstring = "Work string";

        for (int i = 0; i < 3; i++){
            workstring = workstring + i;
            System.out.println(workstring);
        }

        int number = 123123123;
        String numberStr = String.valueOf(number);
        System.out.println(numberStr);

        System.out.println(workstring.charAt(3));
        System.out.println(workstring.toLowerCase());  // уменьшение
        System.out.println(workstring.toUpperCase()); //  увеличение

        String full = "Example";
        String notfull = "am";
        System.out.println(full.indexOf(notfull)); // поиск с какого индекса подстрока есть в строке

        String strr = "Hello java, what are you doing now?";
        System.out.println(strr.substring(5, 15));   // обрезка строк по индексам
        System.out.println(strr.substring(strr.length()-5)); // вариант обрезки с конца


        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" my").append(" friend").append(" i").append(" am").append(" glad").append(" to").append(" see you");
        System.out.println(stringBuilder.toString());

        System.out.printf("To %d this string add, %s , %d" , 10, "Nice", 10); // добавление в метода принтФ





    }
}
