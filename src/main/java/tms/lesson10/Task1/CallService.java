package tms.lesson10.Task1;

public class CallService {
    public static void main(String[] args) {
        Model model = new Model();
        //Вернули строку из Lesson9HomeWork.Task2.Model
        String testValue = model.getString();
        //Присвоили свойству number номер
        model.setNomer(1);
        //Возвращаем значение number из Lesson9HomeWork.Task2.Model
        int number = model.getNomer();
        System.out.println(number);

        Model model2 = new Model(2);
        System.out.println(model2.getNomer());

    }
}
