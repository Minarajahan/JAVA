

class person{
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public class Main {
        public static void main(String[] args) {
            person p = new person();
            p.setName("Alice");
            p.setAge(25);
            p.setEmail("alice@example.com");
            p.setPhoneNumber("1234567890");


            public void displayPersonInfo() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Email: " + email);
                System.out.println("Phone Number: " + phoneNumber);
            }
        }
    }
