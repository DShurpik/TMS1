package alishev.outputclass;

public class Test {
    public static void main(String[] args) {
        ElectroCAr electroCAr = new ElectroCAr(1);
        electroCAr.start();


        ElectroCAr.Battery battery = new ElectroCAr.Battery();
        battery.charge();



    }
}
