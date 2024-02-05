package tms.lesson9.task1;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        User user1 = new User();
        Scanner scanner = new Scanner(System.in);
        //System.out.println(scanner.next());
        String a = scanner.next();
        System.out.println(user1.setName(a));

    }
}
