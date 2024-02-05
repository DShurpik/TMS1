package tms.lesson6HomeWork;

import java.util.Random;

public class Info {
    public static void main(String[] args){  studentinfo();  }
    private static void studentinfo(){
        String[] name = new String[]{"Саша", "Паша", "Даша", "Юля", "Наташа", "Маша"};
        StudentInfo[] students = new StudentInfo[20];
        for (int i = 0; i < students.length; i++) {
            StudentInfo student = new StudentInfo();
            student.setGrade(getRandom(5));
            student.setName(name[getRandom(6)]);
            student.setGroup(getRandom(4));
            students[i] = student;
        }
        System.out.println("Список всех студентов:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println(" ");
        System.out.println("Показать студентов 3-й группы");
        for (int i = 0; i < students.length; i++) {
            students[i].getonlyStudents3group();
        }
    }
    private static int getRandom(int maxLimit){
        Random random = new Random();
        return random.nextInt(maxLimit);
    }
}
