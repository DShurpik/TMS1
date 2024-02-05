package tms.lesson9HomeWork.Task1;

public class Rectangle extends Shape{




    public void perimetrRectangle(){
        System.out.println("perimetr Rectangle = " + 2 * (Rectangle.super.getLenght() + Rectangle.super.getWidth()));
    }


}
