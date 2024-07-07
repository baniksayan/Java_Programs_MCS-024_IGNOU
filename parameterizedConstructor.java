package OOPS_By_Apna_College;
class Student3 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student3(String name, int age) { //Parameterized Constructor
        this.name = name;
        this.age = age;
    }
}
public class parameterizedConstructor {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Sayan", 20);
//        s1.name = "Sayan";
//        s1.age = 20;

        s1.printInfo();
    }
}
