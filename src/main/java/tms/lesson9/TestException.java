package tms.lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i <= numbers.length; i++){
                numbers[i] = scanner.nextInt();
                System.out.println("Получено значение " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException x){
            System.out.println("problem index");
        } catch (InputMismatchException y){
            System.out.println("error");
        } catch (Throwable t){
            System.out.println("incorrect input " + t.fillInStackTrace());
        } finally {
            System.out.println("calculation end");
        }
    }
}
