package tms.lesson9HomeWork.Task2;

import java.util.Scanner;

public class Model {
        int number;
        Scanner scanner = new Scanner(System.in);
        Model(){}
        Model(int nomer){
            this.number = nomer;
        }
        public void setNumber(){
            this.number = scanner.nextInt();
        }
       public int getNumber(){
                return number;
       }
        public String getStr(){
                return "Тестовое значение";
        }



}
