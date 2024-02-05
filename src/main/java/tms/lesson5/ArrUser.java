package tms.lesson5;

import java.util.Random;

public class ArrUser {
    public static void main(String[] args){
        String[] name = new String[]{"Саша", "Паша", "Даша", "Юля", "Наташа"};
        String[] login = new String[]{"Sasha", "Pasha", "dasha", "julya", "natasha"};
        User[] users = new User[5];

        for (int i = 0; i < users.length; i++){
           User user = new User();  //Создаем объект User
           user.setName(name[getRandom(5)]);//передаем значение из массива login по случайному индексом
           user.setLogin(login[getRandom(5)]); //передаем значение из массива name, по индексу i
            users[i] = user;
        }

        for (int i = 0; i < users.length; i++){
            System.out.println(users[i].toString());
        }

    }
    private static int getRandom(int maxLimit){
        Random random = new Random();
        return random.nextInt(maxLimit);
    }
}
