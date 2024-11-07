class student{
    static int y;
    int x;
    void setX(){
        System.out.println("The X is "+x);
    }
    static void setY(){
        y=30;
        System.out.println("The value of X from setY is "+y);
    }
}
public class Main{
    public static void main(String[]args){
        int x=20;
        student s1=new student();
        student s2=new student();
        s1.setX();
        s2.setY();
        student.setY();
    }
}