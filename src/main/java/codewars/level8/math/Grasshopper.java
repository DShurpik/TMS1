package codewars.level8.math;

public class Grasshopper {
    public static void main(String[] args) {
        System.out.println(convertToCelsius(100));
        System.out.println(weatherInfo(100));
    }
    public static String weatherInfo(int temp) {
        double c = (double)convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        return (temperature - 32) * 5/9;
    }
}
