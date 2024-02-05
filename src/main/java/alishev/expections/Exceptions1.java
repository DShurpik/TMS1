package alishev.expections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        File file = new File("asdf");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("1");
        }

        File file1 = new File("gfsdg");

        try {
            Scanner scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("2");
        }
        System.out.println("after 2 blocks try/catch");


    }
}
