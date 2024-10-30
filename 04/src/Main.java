//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int asciiSum = 0;

        for (int i = 0; i < name.length(); i++) {
            asciiSum += (int) name.charAt(i);
        }

        boolean isPrime = true;
        if (asciiSum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(asciiSum); i++) {
                if (asciiSum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println("The sum of ASCII values is: " + asciiSum);

        if (isPrime) {
            System.out.println("The sum is a prime number.");
        } else {
            System.out.println("The sum is not a prime number.");
        }

    }
}