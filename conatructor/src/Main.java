class GrandFather{
    GrandFather(){
        System.out.println("I am GrandFather");
    }
}

class Father extends GrandFather{
    Father(){
        System.out.println("I am Father");
    }
}
class Child extends Father{
    Child(){
        System.out.println("I am Child");
    }
}
public class Main{
    public static void main(String []args) {
        Child c1 = new Child();
    }}
