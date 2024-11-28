class OuterClass{
    private String message="hello from outer class";
    class InnerClass{
        void displayMessage(){
            System.out.println(message);
        }
    }
    public static void main(String[]args){
        StaticNested nested=new StaticNested();
        nested.displayMessage();
    }
}