package tms.lesson9;



public class TestModelCallService {
    public static void main(String[] args) {
        String name = "Test";
        String pre = "Журналист";
        TestModel testModel = new TestModel();
        //Вывести фиксированное имя, которое нельзя менять(грязная реализация)
        System.out.println("Объект 1: " +  testModel.getConstName());
        //Изменять значения name в объекте TestModel
        System.out.println("Объект 1: " + testModel.setName(name));
        //Выводить имя с префиксом, значения префикса : Сотрудник Василий , Менеджер Василий
        testModel.displayInfo(pre);
        //Как создать объект с другим именем?
        TestModel testModel2 = new TestModel();
        // Вариант 1
//        testModel2.name = "Peti";
        // Вариант 2
        System.out.println("Объект 2: " + testModel2.setName("Peti"));
        // Сравнить два объекта testModel и testModel2
        if (testModel.equals(testModel2)){
            System.out.println("Они равны");
        }
    }

}