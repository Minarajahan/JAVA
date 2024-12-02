interface Greeting{
    void sayHelo();
}
class OuterClass{
    public static void main(String[]args){
        Greeting greeting=new Greeting(){
            public void sayHelo(){
                System.out.println("Hello from Anonymous Class");
            }
        };
        greeting.sayHelo();
    }
}