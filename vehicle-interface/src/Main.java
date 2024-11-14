interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car start");
    }

    public void stop() {
        System.out.println("Car stop");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike start");
    }

    public void stop() {
        System.out.println("Bike stop");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        bike.start();
    }
}