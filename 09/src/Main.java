//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        System.out.print("Fibonacci Sequence: ");
        int num1 = 0, num2 = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(num1 + " ");

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }

    }
}