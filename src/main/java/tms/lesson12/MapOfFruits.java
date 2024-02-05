package tms.lesson12;

//Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
// груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOfFruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> fruits = new LinkedHashMap<>(); //Создание списка по порядку
        for (int i = 0; i < 3; i++) {  //через цикл
            String name = scanner.next();
            String type = scanner.next();
            fruits.put(name, type);
        }
        for ( Map.Entry entry : fruits.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue()); // Получаем имя типа
      }
        for ( Map.Entry entry : fruits.entrySet()){ // Показ вид тип-имя
            StringBuilder builder = new StringBuilder();
            builder.append(entry.getKey()).append(" - ").append(entry.getValue());
            System.out.println(builder);
        }

    }
}
