class Test {
    static <T> void genericDisplay(T element) {
        System.out.println(element);
    }
}

public class Main {
    public static void main(String[] args) {
        Test.genericDisplay(11);       // Corrected to Test.genericDisplay
        Test.genericDisplay("OOP");
        Test.genericDisplay(1.0);
    }
}
