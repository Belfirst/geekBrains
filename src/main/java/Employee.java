public class Employee {
    private String fullName;
    private String post;
    private String email;
    private long phoneNumber;
    private int age;

    public Employee(String fullName, String post, String email, long phoneNumber, int age) {
        this.fullName  = fullName;
        this.post  = post;
        this.email = email;
        this.phoneNumber  = phoneNumber;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО " + fullName + "\nДолжность " + post + "\nEmail " + email + "\nНомер телефона " + phoneNumber + "\nВозраст " + age);
    }

    public void setAge(int age) {
        if(this.age >= age) info();
    }
}
