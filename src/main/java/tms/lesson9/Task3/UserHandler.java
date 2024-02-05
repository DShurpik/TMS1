package tms.lesson9.Task3;

public class UserHandler {
    public void callUser(User user, String inputName) {
        user.name(inputName);
        System.out.println("Успешно обработан");

    }
}