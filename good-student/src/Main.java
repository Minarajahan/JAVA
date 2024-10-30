//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class student{
   private int roll;
   private int age;
    student(){
        System.out.println("I am default constructor");
    }
    student(int a){
        roll=1;
        age=25;
        System.out.println("I am a peramiterized constructor with one INT type");
        System.out.println("RollNo:"+roll);
        System.out.println("Age:"+age);
    }
    student(int a,int b){
        System.out.println("I am a perameterrized costructor with two INT type");
    }
    void setAge(int a){
        a=32;
        System.out.println("Age: "+a);
    }

public static void main(String []args){
    student s1=new student();
    s1.setAge(34);
    student s2=new student(12);
    s2.setAge(45);
    student s3=new student(12,25);
    s3.setAge(65);}
}
