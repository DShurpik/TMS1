package tms.lesson8HomeWork.Task3Ver1;

public class Rectangle extends Shape {

    public double width; //ширина
    public double height; //длина

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public void printWidth(){
        System.out.println("Width " + width);
    }
    public void printHeight(){
        System.out.println("Height " + height);
    }
    public void printSquare(){
        System.out.println("Square rectangle = " + width * height);
    }



}

