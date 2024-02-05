package alishev;

public class ArrayStringForEach {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Hello ";
        strings[1] = "Java";
        strings[2] = "!";
        for (int i = 0; i < strings.length; i++){
            System.out.print(strings[i]);
        }
        // тип данных имя переменной  массив
        for (String   string:         strings){
            System.out.print(string);
        }

        int [] arr = {1,2,3,4,5,6};
        int sum = 0;
        for (int x : arr){
            sum = sum + x;
        }
        System.out.println("\n" + sum);
    }

}
