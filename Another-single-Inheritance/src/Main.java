//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class person{
    String name;
    int age;
}
class Employee extends person{
    int employeeId;
    String department;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Alice";
        emp.age=30;
        emp.employeeId=101;
        emp.department="IT";
        emp.display();

    }
}