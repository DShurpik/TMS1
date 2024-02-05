package tms.lesson11.Task3AvgInList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        List<Integer> list = new ArrayList<>();
        while (!value.equals("stop")){
            try {
                list.add(Integer.valueOf(value));
            } catch (Exception ex){
                System.out.println("write only integer");
            }
            value = sc.next();
        }
        double summ = 0;
        for (Integer element : list){
            summ = summ + element;
        }
        double result = summ/list.size();
        System.out.println(result);
    }
}
