package tms.lesson9HomeWork.Task1;

import java.util.InputMismatchException;

public class PerimetrShape {
    public static void main(String[] args) {

        try {
            Circle circle = new Circle();
            System.out.print("Enter radius: ");
            circle.setRadius();
            circle.perimetrCircle();

            Rectangle rectangle = new Rectangle();
            System.out.print("enter width: ");
            rectangle.setWidth();
            System.out.print("enter lenght: ");
            rectangle.setLenght();
            rectangle.perimetrRectangle();
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Вы ввели не корректные данные");
        }


        }

    }

