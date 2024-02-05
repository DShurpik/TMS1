package codewars.level8.fundamentals;

public class SubclassesAdamAndEve {

    public static Human[] create(){
        Human[] humans = new Human[2];
        humans[0] = new Man();
        humans[1] = new Woman();
        return humans;
    }
}

class Human{
    String name;
}

class Man extends Human{
    String name = "Adam";
}

class Woman extends Human{
    String name = "Eve";
    }
