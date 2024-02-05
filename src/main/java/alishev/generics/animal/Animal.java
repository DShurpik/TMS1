package alishev.generics.animal;

public class Animal {
    private int id;

    Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal eat");
    }

    public String toString(){
        return String.valueOf(id);
        // из класса стринг вызывается метод валуеОфф,
        // который целое число конвертирует в строку
    }

}
