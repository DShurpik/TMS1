package tms.lesson9HomeWork.Task2;

public class TestApp {
    public static void main(String[] args) {

        Model model1 = new Model();
        model1.setNumber();
        model1.getStr();
        System.out.println(model1.getNumber() + " " + model1.getStr());

        Model model2 = new Model(8);
        System.out.println(model2.number + " " + model2.getStr());


    }
}
