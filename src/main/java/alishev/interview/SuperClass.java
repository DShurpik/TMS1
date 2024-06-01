package alishev.interview;

public class SuperClass {
    static void staticMethod() {
        System.out.println("Static method in SuperClass");
    }
}
class SubClass extends SuperClass {
    static void staticMethod() {
        System.out.println("Static method in SubClass");
    }
}

class Main {
    public static void main(String[] args) {
        SuperClass.staticMethod();
        SubClass.staticMethod();
    }
}


