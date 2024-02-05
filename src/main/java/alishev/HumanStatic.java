package alishev;

//Ключевое слово языка Java static используется для объявления статических членов класса - методов и переменных.
// Также бывают статические блоки.
//
//Разница между статическими данными и обычными членами класса состоит в том, что обращение к обычному члену класса
// должно осуществляться только в сочетании с объектом его класса. Когда же член класса объявлен
// с ключевым словом static, он доступен и без ссылки на какой-нибудь объект.

public class HumanStatic {
    public static void main(String[] args) {
        Humans humans1 = new Humans("Carl", 35);
        humans1.printInfo();
        Humans.description = "good";
        Humans.getDescription();

        Humans humans2 = new Humans("Max", 45);
        humans2.printInfo();
        humans2.description = "bad";
        humans2.getDescription();

        Humans humans3 = new Humans("Max", 45);
        humans3.printInfo();
        Humans.description = "again good";
        Humans.getDescription();
    }
}

class Humans{

    private String name;
    private int age;

    //Статические переменные Java, объявляются внутри класса с ключевым словом static. Такие переменные, по существу,
    // являются глобальными переменными. При объявлении объектов, копии статических переменных не создаются - создается
    // одна статическая переменная на весь класс. Статическая переменная создается при загрузке класса.
    // Переменная относится не к объекту класса, а к самому классу, и общая для всех объектов класса
    public static String description;
    // конструктор
    public Humans(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void printInfo(){
        //в первой распечатке будет null т.к переменная description создана, но не проинициализированна
        System.out.println(getName() + " " + getAge() + " " + description);
    }
    public static void getDescription(){
        System.out.println(description);
    }

    public static void getAllFields(){

        System.out.println(description + "//name");
        //  в статических методах можно использовать только статичные переменные, поэтому name нельзя использовать,
        // т.к поле имя поле объекта класса Humans
    }


}
