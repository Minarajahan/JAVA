//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class shape{
    void area(){
        System.out.println("Calculating area....");
    }
}
class Rectangle extends shape{
    int length=5, width=3;
    void area(){
        System.out.println("Rectangle area: " + (length*width));
    }
}
class Circle extends shape{
    int radius =4;
    void area(){
        System.out.println("Circle area: "+(3.14*radius*radius));
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.area();
        Circle circle=new Circle();
        circle.area();

    }
}