class student {
    private int roll;
    private int age;
    private int grade;
    student() {
        System.out.println("I am the default constructor");
    }

    student(int a) {
        roll = 1;
        age = 25;
        grade = a;
        System.out.println("I am a parameterized constructor with one INT type");
        System.out.println("Roll No: " + roll);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    student(int a, int b) {
        roll = a;
        grade = b;
        System.out.println("I am a parameterized constructor with two INT types");
        System.out.println("Roll No: " + roll);
        System.out.println("Grade: " + grade);
    }

    void setAge(int a) {
        age = a;
        System.out.println("Age: " + age);
    }
    void setGrade(int g) {
        grade = g;
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.setAge(34);
        s1.setGrade(3);
        student s2 = new student(12);
        s2.setAge(45);
        student s3 = new student(12, 25);
        s3.setAge(65);
    }
}
