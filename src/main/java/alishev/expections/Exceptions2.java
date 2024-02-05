package alishev.expections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws FileNotFoundException {// необходимо добавлять и тут исключения, все методы которые дергают
        readFile();
    }

    public static void readFile() throws FileNotFoundException { // добавляя тут исключение
        File file = new File("file");
        Scanner scanner = new Scanner(file);
    }
}
