package tms.lesson9.task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String inputName = scanner.next();
        System.out.println("Считал " + inputName);
        try {
            user.name(inputName);
        } catch (InputMismatchException e){
            System.out.println("Input normal value name, or program finish");
            user.name(scanner.next());
        }
    }
}



