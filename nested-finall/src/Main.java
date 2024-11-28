class OuterClass{
    void display(){
        final String greeting="Hello from method local inner class";
        class MethodlaocalInner{
            void printMessage(){
                System.out.println(greeting);
            }
        }
        MethodlaocalInner inner=new MethodlaocalInner();
        inner.printMessage();
    }
    public static void main(String[]args){
        OuterClass outer=new OuterClass();
        outer.display();
    }
}