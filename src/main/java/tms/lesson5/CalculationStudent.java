package tms.lesson5;

import java.util.Random;

public class CalculationStudent {

    public static void main(String[] args) {
        task1();
        task2();
    }
    /**
     * Создайте конструктор класса студент и используйте его в цикле.
     * В конструкторе задайте всем студентам одинаковую группу.
     * И установите каждому студенту различную оценку по 10-ти бальной системе с помощью класса Random.
     */
    private static void task2(){

        String[] name = new String[]{"Саша", "Паша", "Даша", "Юля", "Наташа"};
        Student[] students = new Student[14];

        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            student.setGrade(getRandom(10));
            student.setName(name[getRandom(4)]);
            student.setGroup(getRandom(3));
            students[i] = student;
        }



        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

    }

    /**
     * Создайте класс студента с полями:
     * имя
     * группа
     * оценка за диплом
     *
     * В цикле создайте массив из 14-ти студентов.
     */
    private static void task1(){
        String[] name = new String[]{"Саша", "Паша", "Даша", "Юля", "Наташа"};
        Student[] students = new Student[14];

        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            student.setGrade(getRandom(5));
            student.setName(name[getRandom(4)]);
            student.setGroup(getRandom(3));
            students[i] = student;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    private static int getRandom(int maxLimit){
        Random random = new Random();
        return random.nextInt(maxLimit);
    }
}
