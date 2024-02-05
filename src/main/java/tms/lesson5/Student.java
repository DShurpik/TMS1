package tms.lesson5;

public class Student {

    Student(){

    }
    Student(String name, int group, int grade){
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String name;
    public int group;
    public int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Имя " + name + " Группа " + group + " Оценка " + grade;
    }
}
