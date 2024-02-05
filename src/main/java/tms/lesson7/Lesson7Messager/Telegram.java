package tms.lesson7.Lesson7Messager;

public class Telegram implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Send message in Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message in Telegram");

    }
}
