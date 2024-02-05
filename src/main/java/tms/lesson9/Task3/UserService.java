package tms.lesson9.Task3;

import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String inputName = scanner.next();
        System.out.println("Считал " + inputName);
        UserHandler userHandler = new UserHandler();
//        try {
        userHandler.callUser(user, inputName);
//        } catch (Throwable e){
//            System.out.println("Словил ошибку" + e.fillInStackTrace());
//        }

        System.out.println("Отработало до конца");
    }

}
