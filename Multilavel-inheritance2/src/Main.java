//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Device{
    void turnOn(){
        System.out.println("Device is turned on");
    }
}
class phone extends Device{
    void makeCall(){
        System.out.println("Phone is making call.");
    }
}
class SmartPhone extends phone{
    void browseInternet(){
        System.out.println("Smartphone is browsing the internet.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone=new SmartPhone();
        smartphone.turnOn();
        smartphone.makeCall();
        smartphone.browseInternet();
    }
}