package tms.lesson9HomeWork.Task3;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write name: ");
        String inputName = scanner.next();

        System.out.print("Write surname: ");
        String inputSurname = scanner.next();

        //System.out.println("Write name " + inputName);
        //System.out.println("Write surname " + inputSurname);

        UserHandler userHandler = new UserHandler();
        userHandler.callUserName(inputName,user);
        userHandler.callUserSurname(user, inputSurname);

        System.out.println("Full name: "+user.name + " " + user.surname);

    }
}
