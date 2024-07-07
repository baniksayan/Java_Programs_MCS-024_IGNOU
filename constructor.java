package OOPS_By_Apna_College;
class Student2 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student2() {
        System.out.println("Constructor called"); //Non-Parameterized Constructor
    }
}
public class constructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Sayan";
        s1.age = 20;

        s1.printInfo();
    }
}
