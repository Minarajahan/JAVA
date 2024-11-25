class Outer {
    int x = 0;

    void getX() {
        System.out.println("I am getX in outer class");
    }

    void setX() {
        System.out.println("I am setX in outer class");
    }

    void showX() {
        System.out.println("Value of x in outer class: " + x);
    }

    class Inner {
        int x = 5;

        void getX() {
            System.out.println("I am getX in inner class");
        }

        void setX() {
            System.out.println("I am setX in inner class");
        }

        void showX() {
            System.out.println("Value of x in inner class: " + x);
        }
    }

    Inner i1 = new Inner();
}

public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.getX();
        outer.setX();
        outer.showX();

        Outer.Inner newInner = outer.new Inner();
        newInner.getX();
        newInner.setX();
        newInner.showX();
    }
}

