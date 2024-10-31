//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class person{
    String name;
    int age;
}
class Teacher extends person{
    String subject;
    void displayTeacherInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Subject: "+subject);
    }
}
class Student extends person{
    String grade;
    void displayStudentInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Dr.Awais";
        teacher.age=35;
        teacher.subject="Computer Science";
        teacher.displayTeacherInfo();

        Student student=new Student();
        student.name="Minara";
        student.age=23;
        student.grade="A+";
        student.displayStudentInfo();

    }
}