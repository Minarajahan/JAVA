//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface displayMessage{
    void displayMessage();
}

class Main {
    public static void main(String[] args) {
        displayMessage Message=new displayMessage() {
            @Override
            public void displayMessage() {
                System.out.println("Hello display message");
            }
        };
        Message.displayMessage();

    }
}