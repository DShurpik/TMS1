package alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;

        String linkFile1 = "D:"+ separator+"code"+separator+"Teachmeskills"+separator+"teachmeskills"+separator+"test.txt";
        String linkFile2 = "D:"+ separator+"code"+separator+"Teachmeskills"+separator+"teachmeskills"+separator+"test2.txt";
        String linkFile3 = "D:"+ separator+"code"+separator+"Teachmeskills"+separator+"teachmeskills"+separator+"test3.txt";

        File file1 = new File(linkFile1);// в аргумент должны указать путь к файлу
        File file2 = new File(linkFile2);
        File file3 = new File(linkFile3);

        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        Scanner scanner1 = new Scanner(file2);
        String line2 = scanner1.nextLine();
        String[] words1 = line2.split(" ");
        System.out.println(Arrays.toString(words1));

        Scanner scanner2 = new Scanner(file3);
        String line3 = scanner2.nextLine();
        String[] words2 = line3.split(" ");
        int[] numbers = new int[3];
        int count = 0;

        for(String number : words2){
            numbers[count++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
