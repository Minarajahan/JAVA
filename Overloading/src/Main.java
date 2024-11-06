abstract class Product{
    protected double price;
    public Product (double price){
        this.price=price;
    }
    public final void displayPrice(){
        System.out.println("Base Price: "+price);
    }
    public abstract double calculateDiscount();
}
class Electronics extends Product{
    Electronics(double price){
        super(price);
    }
    public double calculateDiscount(){
        return price*0.10;
    }
}
class clothing extends Product{
    public clothing(double price){
        super(price);
    }
    public double calculateDiscount(){
        return price*0.15;
    }
}
public class Main{
    public static void main(String[]args){
        Electronics e=new Electronics(100);
        clothing c=new clothing(200);
        e.calculateDiscount();
    }
}