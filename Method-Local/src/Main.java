import java.io.File;
        public class Main{
    public static void main(String[]args){
        File file=new File("Example.txt");
        if(!file.exists()){
            System.out.println("File does not exist.");
        }
        else{
            System.out.println("File exist"+file.getAbsolutePath());
        }
    }
}