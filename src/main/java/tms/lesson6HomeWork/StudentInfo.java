package tms.lesson6HomeWork;

public class StudentInfo {
    StudentInfo(){}
    public String name;
    public int group;
    public int grade;
    public void setName(String name) {
        this.name = name;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //метод, который будет выводить всю информацию о студенте.
    public void getonlyStudents3group(){
        if (group == 3){
            System.out.println(toString());
        }
    }
    public String toString() {
        return "Имя " + name + " группа " + group + " Оценка " + grade;
    }
}
