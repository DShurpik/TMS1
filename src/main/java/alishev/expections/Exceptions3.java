package alishev.expections;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0){
                try {
                    throw new ScannerExceptions();  // тут создаем исключение которое хотим
                } catch (ScannerExceptions e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class ScannerExceptions extends Exception{
        public ScannerExceptions(){

        }
    }
}
