package tms.lesson7.Lesson7intarface;

public class PrintableService {
    public static void main(String[] args){
        Book book = new Book("War and peace", "Tolstoy", 1863);
        book.print();
    }
}
