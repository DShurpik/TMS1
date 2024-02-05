package tms.lesson9HomeWork.Task4Throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию");
        String name = scanner.next();
        String surname = scanner.next();

        User user = new User();

        try {
            user.setNameAndSurname(name, surname);
        } catch (InputMismatchException e) {
            System.out.println("Введи нормальное значение имени либо программа закончится");
            user.setNameAndSurname(scanner.next(), scanner.next());
        }

        System.out.println("Корректные имя и фамилия:  " + user.getName() + " " + user.getSurname());

    }
}
