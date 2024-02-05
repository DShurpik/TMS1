package alishev.outputclass;

public class ElectroCAr {
    private int id;

    // вложенный нестатичный класс относится к объекту
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is start");
        }
    }

    // статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery charges");
        }
    }

    public ElectroCAr(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        class SomeClass{
            public void someMethod(){
                System.out.println(id);
            }
        }

        System.out.println("Car " + id + " starts");
    }
}
