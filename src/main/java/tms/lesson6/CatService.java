package tms.lesson6;

public class CatService {
    public static void main(String[] args){
        Cat cat = new Cat("Барсик", 3, 90);
        System.out.println(cat.toString());
        System.out.println(cat.checkSatiety());
    }

}
