package tms.lesson7.Lesson7intarface;

public class Book implements Printable{

    private String name;
    private String author;
    private int year;

    public Book(String inputName, String inputAuthor, int inputYear){
        this.name = inputName;
        this.author = inputAuthor;
        this.year = inputYear;
    }

    @Override
    public void print(){
        System.out.println("Name: " + name + " Author: " + author + " Year: " + year);
    }
}
