package tms.lesson9HomeWork.Task3;

public class UserHandler {
    public void callUserSurname(User user, String inputSurname){
        user.setSurname(inputSurname);
        System.out.println("Good surname");
    }
    public void callUserName(String inputName, User user){
        user.setName(inputName);
        System.out.println("Good name");
    }
}
