//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class vehicle{
    int speed;
    String color;
    void start(){
        System.out.println("Vehicle has started.");
    }
}
class car extends vehicle{
    String model;
    void displayDetails(){
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }
}

public class Main{
    public static void main(String[] args) {
        car carObj=new car();
        carObj.speed=120;
        carObj.color="Red";
        carObj.model="Sedan";
        carObj.start();
        carObj.displayDetails();

    }
}