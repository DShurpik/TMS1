package tms.lesson6;

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

    public int getGroup(){
        return group;
    }

    /*
    Тот самый метод, который проверяет студента хороший он или нет и выводит информацию, если студент отличник
     */
    public void getOnlyGoodStudent(){
        if (grade >= 9){
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Name " + name + " group " + group + " Grade " + grade;
    }

}
