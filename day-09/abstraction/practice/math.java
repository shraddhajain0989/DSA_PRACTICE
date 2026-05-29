/*Write a Java program to create an abstract class 
Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and
 implement the respective methods to calculate the area
  and perimeter of each shape. */

import java.lang.Math;
import java.util.Scanner;
abstract class shape{
    abstract void area();
    abstract void perimeter();
}
class circle extends shape {
    Scanner sc = new Scanner(System.in);
    
    private double radius=5;
    void area(){

        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    void perimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}
class triangle extends shape{
    Scanner sc = new Scanner(System.in);
    private double base=3;
    private double height=4;
    private double side1=3;
    private double side2=4;
    private double side3=5  ;
    void area(){
        
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
    void perimeter(){
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}
public class math {
    public static void main(String[]args){
        circle circle = new circle();
        circle.area();
        circle.perimeter();


        triangle triangle = new triangle();
        triangle.area();
        triangle.perimeter();
    }
}
