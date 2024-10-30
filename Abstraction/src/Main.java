//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class shape{
    abstract double area();
}
class Rectangle extends shape {
    double length, width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
}
class Circle extends shape{
    double radious;
    Circle(double radious){
        this.radious=radious;
    }
    double area(){
        return Math.PI*radious*radious;
    }
}

public class Main {
    public static void main(String[] args) {
        shape rectangle=new Rectangle(5,3);
        shape circle=new Circle(4);
        System.out.println("Rectangle Area: "+rectangle.area());
        System.out.println("Circle Area: "+circle.area());
        }
    }
