package tms.lesson6;
import java.util.Random;

public class Grade {
    public static void main(String[] args) {
        task3();
    }

    /**
     * Создайте метод класса студент, который будет выводить всю информацию о студенте.
     *
     * Выведите информацию о всех отличниках (9-10 баллов за диплом) в консоль.
     */
    private static void task3(){

        String[] name = new String[]{"Sasha", "Pasha", "Dasha", "Jooly", "Natasha"};
        StudentGrade[] students = new StudentGrade[14];

        for (int i = 0; i < students.length; i++) {
            StudentGrade student = new StudentGrade();
            student.setGrade(getRandom(10));
            student.setName(name[getRandom(4)]);
            student.setGroup(getRandom(3));
            students[i] = student;
        }

        System.out.println("Get only good students");
        for (int i = 0; i < students.length; i++) {
            students[i].getOnlyGoodStudent();
        }

        System.out.println("Get all students");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

    }

    private static int getRandom(int maxLimit){
        Random random = new Random();
        return random.nextInt(maxLimit);
    }

}
