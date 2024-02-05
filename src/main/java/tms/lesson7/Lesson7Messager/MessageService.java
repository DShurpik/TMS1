package tms.lesson7.Lesson7Messager;

public class MessageService {
    public static void main(String [] args){
        Telegram telegram = new Telegram();
       // telegram.getMessage();
        //telegram.sendMessage();
        callMessenger(telegram);



        WhatsApp whatsApp = new WhatsApp();
        //whatsApp.getMessage();
        //whatsApp.sendMessage();

        callMessenger(whatsApp);
    }



    private static void callMessenger(Messenger messenger){
        messenger.getMessage();
        messenger.sendMessage();
    }
}
