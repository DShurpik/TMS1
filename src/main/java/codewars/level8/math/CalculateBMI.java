package codewars.level8.math;

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println(bmi(85, 190));
    }
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi <= 18.5 ? "Underweight" : bmi <= 25 ? "Normal" : bmi <= 30 ? "Overweight" : bmi > 30 ? "Obese" : "";
    }
}
