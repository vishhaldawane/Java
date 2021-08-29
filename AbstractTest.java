import java.awt.*;

public class AbstractTest {
    public static void main(String[] args) {
        //GeometricalShape gs = new GeometricalShape();

        Circle c = new Circle(50);
        Triangle t = new Triangle(10,20);
        Square s = new Square(60);

        c.draw(); c.calculateArea();
        t.draw(); t.calculateArea();
        s.draw(); s.calculateArea();

    }
}
//abstract means incomplete
//art galllery - u see some pictures
//these picture may not have any meaning
//one person can see a tree, some one can see a ghost
//other can see a God, someone can see cloud


//any abstract function must reside in an abstract class
/*
                        GeometricalShape
                                | draw(); //declared
                  ------------------------
                   |        |           |
                   Circle   Triangle    Square
            draw(){}        draw(){}       draw(){}

 in reality is there any shape known as GeometricalShape?

 it is a communal name
 */

//if u want to impose some business rules over the children classes
//then go for abstract classes and interfaces

abstract class GeometricalShape
{
    abstract void draw(); // abstract function
    abstract void calculateArea();
}
//dont we impose some mandate on our kids
//eg. must wake up at 6, must drink milk, must do study

class Circle extends GeometricalShape
{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void draw() { //mandatory implementation
        System.out.println("Circle is drawn....");
    }
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area is : "+area);
    }
}
class Triangle extends GeometricalShape
{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    void draw() { //mandatory implementation
        System.out.println("Triangle is drawn....");
    }
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle "+area);
    }
}
class Square extends GeometricalShape
{
    int side;

    public Square(int side) {
        this.side = side;
    }

    void draw() { //mandatory implementation
        System.out.println("Square is drawn....");
    }
    void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square : "+area);
    }
}