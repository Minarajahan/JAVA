class vehicle(){
    void fillTank(){
        System.out.println("The tank is being filled");
    }
    void showTankCapacity(int capacity){
        System.out.println("Tank capacity is:"+capacity);
    }
    void applyBreaks(){
        System.out.println("Vehicle is applying break");
    }
    class Bike extends vehicle{
    }
    Bike b1=new Bike();

}


