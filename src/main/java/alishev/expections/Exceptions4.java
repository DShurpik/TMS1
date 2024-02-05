package alishev.expections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args) {
        // Checked = исключительные случаи в работе программы

        // Unchecked (Runtime exception)= ошибка в работе программы (например деление на 0, в переменной null и мы вызываем на пустоту метод)
        // или выход за пределы массива

        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Checked exceptions");
        }
    }
}
