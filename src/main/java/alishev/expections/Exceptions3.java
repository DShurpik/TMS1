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
                    throw new IOException();  // тут создаем исключение которое хотим
                } catch (IOException e) {
                    System.out.println("user enter smthg above 0");;
                }
            }
        }
    }

    public class ScannerExceptions extends Exception{
        public ScannerExceptions(){

        }
    }
}
